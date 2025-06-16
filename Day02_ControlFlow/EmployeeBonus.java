package Day02_ControlFlow;

import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: Salary and Years of Service
        double salary = sc.nextDouble();
        int yearsOfService = sc.nextInt();

        if (yearsOfService > 5) {
            double bonus = salary * 0.05;
            System.out.println("Bonus amount: ₹" + bonus);
        } else {
            System.out.println("No bonus. Years of service is less than or equal to 5.");
        }

        sc.close();
    }
}

