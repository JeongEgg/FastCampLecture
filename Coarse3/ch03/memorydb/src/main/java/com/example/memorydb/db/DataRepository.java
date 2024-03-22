package com.example.memorydb.db;

import java.util.List;
import java.util.Optional;

public interface DataRepository<T,ID> extends Repository<T,ID> {
    // CRUD 기능을 가지는 인터페이스

    // Create, Update
    T save(T data);

    // Read
    Optional<T> findById(ID id);

    List<T> findAll();

    // Delete
    void delete(ID id);
}
