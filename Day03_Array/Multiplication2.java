package Day03_Array;

import java.util.Scanner;

public class Multiplication2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        if(n>=6 && n<=9){
            System.out.println("number is "+n);

            for (int i=1;i<=10;i++){
                int mul=i*n;
                System.out.print(mul+" ");
            }
        }else {
            System.out.println("invalid number");
        }

    }
}
