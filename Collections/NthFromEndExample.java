package Collections;

import java.util.*;

public class NthFromEndExample {
    public static <T> T findNthFromEnd(LinkedList<T> list, int n) {
        Iterator<T> first = list.iterator();
        Iterator<T> second = list.iterator();

        // Move first pointer n steps ahead
        for (int i = 0; i < n; i++) {
            if (first.hasNext()) {
                first.next();
            } else {
                return null; // If n > size
            }
        }

        // Move both pointers until first reaches the end
        while (first.hasNext()) {
            first.next();
            second.next();
        }
        return second.next();
    }

    public static void main(String[] args) {
        LinkedList<String> letters = new LinkedList<>(Arrays.asList("A", "B", "C", "D", "E"));
        int n = 2;
        String result = findNthFromEnd(letters, n);
        System.out.println("Nth element from end: " + result);
    }
}


