package StringPrograms;

import java.util.Scanner;

public class CharTypeCheck {

    // Check if a character is vowel/consonant/not letter
    public static String checkCharType(char ch) {
        // Convert uppercase to lowercase
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32);
        }

        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }
        return "Not a Letter";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        for (int i = 0;; i++) {
            try {
                char ch = input.charAt(i);
                System.out.println(ch + " -> " + checkCharType(ch));
            } catch (StringIndexOutOfBoundsException e) {
                break;
            }
        }
    }
}

