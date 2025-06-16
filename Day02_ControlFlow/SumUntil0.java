package Day02_ControlFlow;

import java.util.Scanner;

public class SumUntil0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        while (true) {
            int num = sc.nextInt();
            if (num <= 0) {
                break;
            }
            sum += num;
        }

        System.out.println("The sum is " + sum);
        sc.close();
    }
}
