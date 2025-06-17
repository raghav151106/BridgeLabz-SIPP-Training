package Day03_Array;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=10;i++){
            int a= i*n;
            System.out.print(a+" ");
        }
    }

}
