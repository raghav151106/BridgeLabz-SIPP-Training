package Day04_Method;

import java.util.Scanner;

public class Char {

    // Method to return characters in a string without using toCharArray()
    public static char[] getChars(String str) {
        char[] result = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            result[i] = str.charAt(i);
        }
        return result;
    }

    // Method to compare two character arrays
    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String input = sc.next();

        // Call user-defined method
        char[] userChars = getChars(input);

        // Call built-in toCharArray() method
        char[] builtInChars = input.toCharArray();

        // Compare both character arrays
        boolean result = compareCharArrays(userChars, builtInChars);

        // Display the result
        System.out.println("User-defined method characters: ");
        for (char c : userChars) {
            System.out.print(c + " ");
        }

        System.out.println("\nBuilt-in toCharArray() characters: ");
        for (char c : builtInChars) {
            System.out.print(c + " ");
        }

        System.out.println("\nArrays are equal: " + result);
    }
}

