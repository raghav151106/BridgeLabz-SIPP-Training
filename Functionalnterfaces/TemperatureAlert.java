package Functionalnterfaces;

import java.util.function.Predicate;

public class TemperatureAlert {
    public static void main(String[] args) {
        Predicate<Double> isHigh = temp -> temp > 30.0;

        double currentTemp = 35.5;
        if (isHigh.test(currentTemp)) {
            System.out.println("Temperature alert! Too hot!");
        }
    }
}

