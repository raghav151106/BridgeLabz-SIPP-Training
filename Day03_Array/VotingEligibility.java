package Day03_Array;

import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[10];

        // Input and processing together
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();

            if (ages[i] < 0) {
                System.out.println("Invalid age entered.");
            } else if (ages[i] >= 18) {
                System.out.println("Student can vote.");
            } else {
                System.out.println("Student cannot vote.");
            }
        }

        sc.close();
    }
}
