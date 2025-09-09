package StringPrograms;

import java.util.Scanner;

public class ShortestLongestWord {

    // Method to find string length without length()
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

    // Method to split text into words
    public static String[] customSplit(String text) {
        int length = getStringLength(text);
        int spaceCount = 0;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceCount++;
            }
        }

        String[] words = new String[spaceCount + 1];
        int wordIndex = 0, start = 0;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                words[wordIndex] = text.substring(start, i);
                wordIndex++;
                start = i + 1;
            }
        }
        words[wordIndex] = text.substring(start, length);

        return words;
    }

    // Create 2D array with word and its length
    public static String[][] wordsWithLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(getStringLength(words[i]));
        }
        return result;
    }

    // Find shortest and longest words
    public static String[] findShortestLongest(String[][] wordLengths) {
        String shortest = wordLengths[0][0];
        String longest = wordLengths[0][0];
        int minLen = Integer.parseInt(wordLengths[0][1]);
        int maxLen = minLen;

        for (String[] row : wordLengths) {
            int len = Integer.parseInt(row[1]);
            if (len < minLen) {
                minLen = len;
                shortest = row[0];
            }
            if (len > maxLen) {
                maxLen = len;
                longest = row[0];
            }
        }
        return new String[]{shortest, longest};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String text = sc.nextLine();

        String[] words = customSplit(text);
        String[][] wordLengths = wordsWithLengths(words);
        String[] result = findShortestLongest(wordLengths);

        System.out.println("Shortest word: " + result[0]);
        System.out.println("Longest word: " + result[1]);
    }
}

