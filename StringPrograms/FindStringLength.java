package StringPrograms;

import java.util.Scanner;

public class FindStringLength {

    // Method to find length of string without using length()
    public static int getStringLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {}
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.next();

        int customLength = getStringLength(input);
        int builtInLength = input.length();

        System.out.println("Custom length calculation: " + customLength);
        System.out.println("Built-in length() method: " + builtInLength);
    }
}

