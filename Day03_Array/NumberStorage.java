package Day03_Array;

import java.util.Scanner;

public class NumberStorage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] numbers = new double[10]; // Max 10 elements
        double total = 0.0;
        int index = 0;

        // Taking input
        while (true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            double input = sc.nextDouble();

            // Stop if input is 0 or negative
            if (input <= 0) {
                break;
            }

            // Stop if array is full
            if (index == 10) {
                System.out.println("Maximum limit of 10 numbers reached.");
                break;
            }

            // Store number and move index
            numbers[index] = input;
            index++;
        }

        // Display stored numbers
        System.out.println("\nStored Numbers:");
        for (int i = 0; i < index; i++) {
            System.out.println("Number " + (i + 1) + ": " + numbers[i]);
            total += numbers[i];
        }

        // Display total
        System.out.println("Total Sum = " + total);

        sc.close();
    }
}

