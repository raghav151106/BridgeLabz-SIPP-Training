package Functionalnterfaces;

import java.util.function.Function;

public class StringLengthChecker {
    public static void main(String[] args) {
        Function<String, Integer> lengthFunc = s -> s.length();

        String message = "Hello, world!";
        System.out.println("Length of message: " + lengthFunc.apply(message));
    }
}

