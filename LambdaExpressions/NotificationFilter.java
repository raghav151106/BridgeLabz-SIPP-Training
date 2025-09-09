package LambdaExpressions;

import java.util.*;
import java.util.function.Predicate;

public class NotificationFilter {
    public static void main(String[] args) {
        List<String> notifications = Arrays.asList(
                "Appointment reminder", "Lab result available", "Emergency alert"
        );

        // Lambda Predicate: filter only notifications containing "alert"
        Predicate<String> isAlert = msg -> msg.toLowerCase().contains("alert");

        notifications.stream()
                .filter(isAlert)
                .forEach(System.out::println);
    }
}

