package com.dateandtime;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TimeZoneScheduler {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Prompt user for meeting date and time
        System.out.println("Enter the meeting date and time (yyyy-MM-dd HH:mm): ");
        String dateTimeInput = scanner.nextLine();
        // Prompt user for input time zone
        System.out.println("Enter the input time zone (e.g., America/New_York, Europe/London): ");
        String inputTimeZone = scanner.nextLine();
        try {
            // Parse the input date and time
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
            LocalDateTime localDateTime = LocalDateTime.parse(dateTimeInput, formatter);

            // Create a ZonedDateTime in the input time zone
            ZonedDateTime inputZonedDateTime = ZonedDateTime.of(localDateTime, ZoneId.of(inputTimeZone));
            System.out.println("\nMeeting Time in Input Time Zone (" + inputTimeZone + "): " 
                                + inputZonedDateTime.format(formatter));

            // Prompt user for other time zones to convert to
            System.out.println("\nEnter the time zones to convert to (comma-separated, e.g., Asia/Tokyo, Australia/Sydney): ");
            String[] timeZones = scanner.nextLine().split(",");

            System.out.println("\nMeeting Time in Other Time Zones:");
            for (String timeZone : timeZones) {
                try {
                    // Convert to each target time zone
                    ZoneId targetZoneId = ZoneId.of(timeZone.trim());
                    ZonedDateTime targetZonedDateTime = inputZonedDateTime.withZoneSameInstant(targetZoneId);

                    // Display the converted time
                    System.out.println(timeZone.trim() + ": " 
                                       + targetZonedDateTime.format(formatter));
                } catch (Exception e) {
                    System.out.println("Invalid time zone: " + timeZone.trim());
                }
            }

        } catch (Exception e) {
            System.out.println("Invalid date/time or time zone input. Please try again.");
        }
        scanner.close();
    }
}
