/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.example;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;

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
    }
}
