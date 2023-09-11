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

        System.out.println("Geburtstag von " + dimSum.getName() + ": " + dimSum.getBirthday().format(formatter));

        System.out.println("=== Wie lange bis zum nächsten Geburtstag? ===");
        long daysfromBirthday = ChronoUnit.DAYS.between(LocalDate.now(), dimSum.getBirthday());
        // Geburtstag in diesem Jahr gewesen?
        if (LocalDate.now().getMonthValue() > dimSum.getBirthday().getMonthValue()) {

            dimSum.setBirthday(LocalDate.of(LocalDate.now().getYear() + 1, dimSum.getBirthday().getMonth(), dimSum.getBirthday().getDayOfMonth()));

        } else if ((LocalDate.now().getMonthValue() == dimSum.getBirthday().getMonthValue())) {
            if (LocalDate.now().getDayOfMonth() > dimSum.getBirthday().getDayOfMonth()) {
                dimSum.setBirthday(LocalDate.of(LocalDate.now().getYear() + 1, dimSum.getBirthday().getMonth(), dimSum.getBirthday().getDayOfMonth()));
            } else {
                dimSum.setBirthday(LocalDate.of(LocalDate.now().getYear(), dimSum.getBirthday().getMonth(), dimSum.getBirthday().getDayOfMonth()));
            }
        } else {

            dimSum.setBirthday(LocalDate.of(LocalDate.now().getYear(), dimSum.getBirthday().getMonth(), dimSum.getBirthday().getDayOfMonth()));
        }
        long daysUntilBirthday = ChronoUnit.DAYS.between(LocalDate.now(), dimSum.getBirthday());
        // Alter berechnen
        long yearsOld = (daysfromBirthday * -1 + daysUntilBirthday) / 365;
        System.out.println("Noch \u001B[35m" + daysUntilBirthday + "\u001B[0m Tage bis zum \u001B[31m" + yearsOld + "\u001B[0mten Geburtstag!!!");


    }
}