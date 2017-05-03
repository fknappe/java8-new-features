package br.com.github.java8.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class UseLocalDateTime {

    public static void main(String[] args) {

        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);

        LocalDate specificDate = LocalDate.of(1985, 1, 15);
        System.out.println(specificDate);

        LocalTime currentTime = LocalTime.now();
        System.out.println(currentTime);

        LocalTime specificTime = LocalTime.of(12, 8, 0);
        System.out.println(specificTime);

        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println(currentDateTime);

        LocalDateTime specificDateTime = LocalDateTime.of(specificDate, specificTime);
        System.out.println(specificDateTime);
    }
}
