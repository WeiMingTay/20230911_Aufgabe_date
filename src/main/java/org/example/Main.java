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
        int weeks = 2;
        System.out.println("=== plus "+weeks+" Wochen ===");
        LocalDateTime newNow = now.plusWeeks(weeks);
        System.out.println(newNow);
        System.out.println(
                newNow.getDayOfMonth()
                        +". "
                        +newNow.getMonth()
                        +"."
                        +newNow.getYear());
    }
}