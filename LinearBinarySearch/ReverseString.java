package LinearBinarySearch;

public class ReverseString {
    public static void main(String[] args) {
        String input = "hello";

        // Create StringBuilder and reverse
        StringBuilder sb = new StringBuilder(input);
        String reversed = sb.reverse().toString();

        System.out.println("Original: " + input);
        System.out.println("Reversed: " + reversed);
    }
}

