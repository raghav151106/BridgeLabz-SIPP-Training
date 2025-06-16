package Day02_ControlFlow;

import java.util.Scanner;

public class FriendsComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: Ages
        System.out.print("Enter age of Amar: ");
        int ageAmar = sc.nextInt();
        System.out.print("Enter age of Akbar: ");
        int ageAkbar = sc.nextInt();
        System.out.print("Enter age of Anthony: ");
        int ageAnthony = sc.nextInt();

        // Input: Heights
        System.out.print("Enter height of Amar: ");
        double heightAmar = sc.nextDouble();
        System.out.print("Enter height of Akbar: ");
        double heightAkbar = sc.nextDouble();
        System.out.print("Enter height of Anthony: ");
        double heightAnthony = sc.nextDouble();

        // Determine the youngest
        String youngest = "";
        int minAge = Math.min(ageAmar, Math.min(ageAkbar, ageAnthony));
        if (minAge == ageAmar) {
            youngest = "Amar";
        } else if (minAge == ageAkbar) {
            youngest = "Akbar";
        } else {
            youngest = "Anthony";
        }

        // Determine the tallest
        String tallest = "";
        double maxHeight = Math.max(heightAmar, Math.max(heightAkbar, heightAnthony));
        if (maxHeight == heightAmar) {
            tallest = "Amar";
        } else if (maxHeight == heightAkbar) {
            tallest = "Akbar";
        } else {
            tallest = "Anthony";
        }

        // Output
        System.out.println("The youngest friend is: " + youngest);
        System.out.println("The tallest friend is: " + tallest);

        sc.close();
    }
}

