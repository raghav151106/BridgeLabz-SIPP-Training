package LinearBinarySearch;

public class StringBufferConcat {
    public static void main(String[] args) {
        String[] words = {"Java", "is", "fast", "and", "powerful"};

        StringBuffer sb = new StringBuffer();
        for (String word : words) {
            sb.append(word).append(" ");
        }

        System.out.println("Concatenated: " + sb.toString().trim());
    }
}

