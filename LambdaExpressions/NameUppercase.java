package LambdaExpressions;

import java.util.*;

public class NameUppercase {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        // Using method reference String::toUpperCase
        names.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
