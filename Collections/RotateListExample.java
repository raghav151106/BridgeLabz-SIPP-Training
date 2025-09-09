package Collections;

import java.util.*;

public class RotateListExample {
    public static <T> void rotateList(List<T> list, int k) {
        int n = list.size();
        k = k % n; // Handle rotations greater than size
        List<T> rotated = new ArrayList<>();
        rotated.addAll(list.subList(k, n));
        rotated.addAll(list.subList(0, k));
        list.clear();
        list.addAll(rotated);
    }

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
        rotateList(numbers, 2);
        System.out.println("Rotated List: " + numbers);
    }
}

