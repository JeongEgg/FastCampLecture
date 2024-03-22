package com.example.memorydb.db;

import com.example.memorydb.entity.Entity;

import java.util.*;
import java.util.stream.Collectors;

public abstract class SimpleDataRepository<T extends Entity, ID extends Long> implements DataRepository<T, ID> {
    // DataRepository에서 상속받은 추상메서드들을 실제로 구현.

    // 데이터 저장소에 대한 값 초기화
    private List<T> dataList = new ArrayList<>();
    private static long index = 0;
    private Comparator<T> sort = new Comparator<T>() {
        @Override
        public int compare(T o1, T o2) {
            return Long.compare(o1.getId(), o2.getId());
        }
    };

    // Create, Update
    @Override
    public T save(T data) {
        if (Objects.isNull(data)){
            throw new RuntimeException("Data is null");
        }
        // db에 데이터가 있는지?
        var prevData = dataList.stream()
                .filter(it -> {
                    return it.getId().equals(data.getId());
                })
                .findFirst();
        if (prevData.isPresent()){
            // 데이터 있는 경우(Update)
            // prevData의 타입 : Optional<UserEntity>
            // UserEntity를 지우기 위해서 get 메서드를 추가해야 한다.
            dataList.remove(prevData.get());
            dataList.add(data);
        }else {
            // 데이터 없는 경우(Create)
            // unique id
            index++;
            data.setId(index);
            dataList.add(data);
        }
        return data;
    }

    // Read
    @Override
    public Optional<T> findById(ID id){
        return dataList.stream()
                .filter(it -> {
                    return it.getId().equals(id);
                })
                .findFirst();
    }

    @Override
    public List<T> findAll(){
        return dataList.stream()
                .sorted(sort)
                .collect(Collectors.toList());
    }

    // Delete
    @Override
    public void delete(ID id){
        var deleteEntity = dataList.stream()
                .filter(it -> {
                    return it.getId().equals(id);
                })
                .findFirst();
        if (deleteEntity.isPresent()){
            dataList.remove(deleteEntity.get());
        }
    }
}
