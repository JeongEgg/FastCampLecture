package org.example.ex08;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Optional;

public class Exam08 {

    public Exam08(Store store){
//        var stringRegisterAt = toLocalDateTimeString(store.getRegisterAt());
        var stringRegisterAt = toLocalDateTimeString(
                Optional.ofNullable(store.getRegisterAt())
        );
    }

    public String toLocalDateTimeString(Optional<LocalDateTime> localDateTime){
//        LocalDateTime temp;
//
//        if (localDateTime == null){
//            temp = LocalDateTime.now();
//        }else {
//            temp = localDateTime;
//        }
        LocalDateTime temp = localDateTime.orElseGet(() -> LocalDateTime.now());

//        return localDateTime.format(DateTimeFormatter.ofPattern("yyyy MM dd"));

        return temp.format(DateTimeFormatter.ofPattern("yyyy MM dd"));
    }

    public static void main(String[] args) {
        // client -->
        var registerDto = new Store();

        new Exam08(registerDto);
    }
}

class Store {
    private LocalDateTime registerAt;

    public LocalDateTime getRegisterAt() {
        return registerAt;
    }

    public void setRegisterAt(LocalDateTime registerAt) {
        this.registerAt = registerAt;
    }
}