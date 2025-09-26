package com.dateandtime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class DateValidator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for date input
        System.out.println("Enter a date (e.g., yyyy-MM-dd, dd-MM-yyyy, MM/dd/yyyy): ");
        String userInput = scanner.nextLine();

        // Define acceptable date formats
        String[] dateFormats = {"yyyy-MM-dd", "dd-MM-yyyy", "MM/dd/yyyy"};

        LocalDate parsedDate = null;

        // Try parsing the date with each format
        for (String format : dateFormats) {
            try {
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
                parsedDate = LocalDate.parse(userInput, formatter);
                break; // Exit loop if parsing is successful
            } catch (DateTimeParseException e) {
                // Continue trying other formats
            }
        }

        // Check if date was successfully parsed
        if (parsedDate != null) {
            // Standardize the date format
            DateTimeFormatter standardFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            String standardizedDate = parsedDate.format(standardFormatter);
            System.out.println("Validated and standardized date: " + standardizedDate);
        } else {
            System.out.println("Invalid date input. Please try again.");
        }

        scanner.close();
    }
}
