package Day01_ProgrammingElements;
import java.util.Scanner;
public class UniversityFee {
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        int fee=sc.nextInt();
        int discount= sc.nextInt();
        int discountedAmount=(fee * discount)/100;
        int discountedPrice= fee - discountedAmount;
        System.out.println("The discount amount is INR "+discountedAmount+"and final discounted fee is INR "+discountedPrice);

    }
}
