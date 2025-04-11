/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.example;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author Ingo
 */
public class Java_date {

    public static void main(String[] args) {

        // LocaleDate - date without timezone
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        // LocalDateTime - date with time and without timezone
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        // ZonedDateTime - date with time and timezone
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println(zonedDateTime);

        // Instant - international date with time (Zulu time)
        Instant instant = Instant.now();
        System.out.println(instant);

        // Change Instant into LocalDateTime
        ZoneId zoneIdLocal = ZoneId.systemDefault(); // local timezone
        ZoneId zoneIdZone = ZoneId.of("Asia/Tokyo");   // selected timezone
        LocalDateTime localDateTimeTokyo = LocalDateTime.ofInstant(instant, zoneIdZone);
        System.out.println(localDateTimeTokyo);

        // Change LocalDateTime into Instant
        Instant instantLocal = localDateTime.atZone(zoneIdLocal).toInstant();
        System.out.println(instantLocal);

        // Formatting date and time
        // d - day, E - weekday, M - month, y - jear, H - hour, m - minute, s- second, n - nano
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EE, dd.MMMM.yyyy : HH:mm:ss");
        String formattedDate = localDateTime.format(formatter);
        System.out.println(formattedDate);

        // Change String into LocalDateTime
        String time = "12.08.2024 : 11:11:11";
        DateTimeFormatter newFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy : HH:mm:ss");
        LocalDateTime stringToLocalDateTime = LocalDateTime.parse(time, newFormatter);
        System.out.println(stringToLocalDateTime);

        // Difference between two point in time
        LocalDateTime start = LocalDateTime.of(2025, 02, 01, 11, 11);
        LocalDateTime end = LocalDateTime.of(2025, 03, 01, 11, 11);

        long diffHour = ChronoUnit.HOURS.between(start, end);
        System.out.println(diffHour);
        long diffSeconds = ChronoUnit.SECONDS.between(start, end);
        System.out.println(diffSeconds);

        // TASK
        LocalDate newDate = localDate.plusWeeks(2);
        int diff = localDate.compareTo(newDate);
        System.out.println("The local date lies behind " + Math.abs(diff) + " days.");
    }
}
