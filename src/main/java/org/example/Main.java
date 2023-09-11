package org.example;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        System.out.println(
                now.getDayOfMonth()
                +". "
                +now.getMonth()
                +"."
                +now.getYear());
        System.out.println(
                now.getHour()
                +":"
                +now.getMinute()
                +":"
                +now.getSecond()
        );
    }
}