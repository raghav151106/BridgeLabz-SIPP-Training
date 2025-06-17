package Day03_Array;

import java.util.Scanner;

public class FizzBuzzProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Get user input
        System.out.print("Enter a positive number: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        // Step 2: Create a String array
        String[] result = new String[n + 1];

        // Step 3: Loop from 0 to n and store values in array
        for (int i = 0; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0 && i != 0) {
                result[i] = "FizzBuzz";
            } else if (i % 3 == 0 && i != 0) {
                result[i] = "Fizz";
            } else if (i % 5 == 0 && i != 0) {
                result[i] = "Buzz";
            } else {
                result[i] = Integer.toString(i);
            }
        }

        // Step 4: Print results
        System.out.println("\nFizzBuzz Results:");
        for (int i = 0; i <= n; i++) {
            System.out.println("Position " + i + " = " + result[i]);
        }

        sc.close();
    }
}

