package BuiltInFunction;

import java.time.LocalDate;

public class DateArithmetic {
    public static void main(String[] args) {
        // Example input date
        LocalDate date = LocalDate.of(2023, 9, 9);
        System.out.println("Original Date : " + date);

        // Add 7 days, 1 month, 2 years
        LocalDate updated = date.plusDays(7).plusMonths(1).plusYears(2);
        System.out.println("After Adding 7 days, 1 month, 2 years : " + updated);

        // Subtract 3 weeks
        LocalDate finalDate = updated.minusWeeks(3);
        System.out.println("After Subtracting 3 weeks : " + finalDate);
    }
}

