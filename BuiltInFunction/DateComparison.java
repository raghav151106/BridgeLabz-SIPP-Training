package BuiltInFunction;

import java.time.LocalDate;

public class DateComparison {
    public static void main(String[] args) {
        // Example dates
        LocalDate date1 = LocalDate.of(2023, 9, 9);
        LocalDate date2 = LocalDate.of(2025, 9, 9);

        System.out.println("Date 1: " + date1);
        System.out.println("Date 2: " + date2);

        if (date1.isBefore(date2)) {
            System.out.println("Date 1 is before Date 2");
        } else if (date1.isAfter(date2)) {
            System.out.println("Date 1 is after Date 2");
        } else {
            System.out.println("Both dates are the same");
        }
    }
}

