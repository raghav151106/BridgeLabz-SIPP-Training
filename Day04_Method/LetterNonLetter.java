package Day04_Method;

import java.util.Scanner;

public class LetterNonLetter {

    // Method to check character type
    public static String getCharType(char ch) {
        ch = Character.toLowerCase(ch);

        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        } else {
            return "Not a Letter";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        System.out.println("\nCharacter\tType");
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            String type = getCharType(ch);
            System.out.println(ch + "\t\t" + type);
        }
    }
}

