package org.example;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== aktuelle Datum ===");
        LocalDateTime now = LocalDateTime.now();
        // System.out.println(now);
        System.out.println(
                now.getDayOfMonth()
                        + ". "
                        + now.getMonth()
                        + " "
                        + now.getYear());
        System.out.println(
                now.getHour()
                        + ":"
                        + now.getMinute()
                        + ":"
                        + now.getSecond()
        );

        int weeks = 2;
        System.out.println("=== plus " + weeks + " Wochen ===");
        LocalDateTime newNow = now.plusWeeks(weeks);
        // System.out.println(newNow);
        System.out.println(
                newNow.getDayOfMonth()
                        + ". "
                        + newNow.getMonth()
                        + " "
                        + newNow.getYear());

        System.out.println("=== vor oder nach? ===");
        System.out.println("--- deutsches Format ---");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd. MMMM yyyy", Locale.GERMAN);
        LocalDate twoYears = LocalDate.of(2023, 10, 25);
        String formattedDate = twoYears.format(formatter);
        System.out.println("<3 " + formattedDate + " <3");

        LocalDate dateNow = LocalDate.now();
        // System.out.println(dateNow);
        // System.out.println(twoYears);

        int compareDate = dateNow.compareTo(twoYears);
        long daysDifference = ChronoUnit.DAYS.between(dateNow, twoYears);
        if (daysDifference < 0) {
            daysDifference = daysDifference * -1;
        }

        if (compareDate < 0) {
            System.out.println(dateNow.format(formatter) + " liegt " + daysDifference + " Tage \u001B[32mvor\u001B[0m dem " + twoYears.format(formatter));
        } else if (compareDate > 0) {
            System.out.println(dateNow.format(formatter) + " liegt " + daysDifference + " Tage \u001B[32mnach\u001B[0m dem " + twoYears.format(formatter));
        } else {
            System.out.println("Beide Tage sind gleich");
        }

        System.out.println("=== === Bonus Aufgaben === ===");
        Animal dimSum = new Animal("Dim Sum", LocalDate.of(2016, 4, 1));

        System.out.println(dimSum);

        System.out.println("=== Wie lange bis zum nächsten Geburtstag? ===");
        // Geburtstag in diesem Jahr gewesen?
        if (LocalDate.now().getMonthValue() > dimSum.getBirthday().getMonthValue()) {
            // System.out.println("Birthday already happened");
            dimSum.setBirthday(LocalDate.of(LocalDate.now().getYear() + 1, dimSum.getBirthday().getMonth(), dimSum.getBirthday().getDayOfMonth()));

        } else {
            dimSum.setBirthday(LocalDate.of(LocalDate.now().getYear(), dimSum.getBirthday().getMonth(), dimSum.getBirthday().getDayOfMonth()));
        }
        long daysUntilBirthday = ChronoUnit.DAYS.between(LocalDate.now(), dimSum.getBirthday());
        System.out.println("Noch " + daysUntilBirthday + " Tage bis zum nächsten Geburtstag!!!");


    }
}