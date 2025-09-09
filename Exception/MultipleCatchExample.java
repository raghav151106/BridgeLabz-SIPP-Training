package Exception;

import java.util.*;

public class MultipleCatchExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer[] arr = null; // can try with actual array too
        try {
            // Example array
            arr = new Integer[]{10, 20, 30, 40};

            System.out.print("Enter index to access: ");
            int index = sc.nextInt();

            System.out.println("Value at index " + index + ": " + arr[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index!");
        } catch (NullPointerException e) {
            System.out.println("Array is not initialized!");
        }
    }
}

