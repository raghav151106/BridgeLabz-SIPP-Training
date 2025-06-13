package Day01_ProgrammingElements;
import java.util.Scanner;
public class Handshakes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfStudents= sc.nextInt();
        int maxNumOfHandshakes= (numberOfStudents*(numberOfStudents-1))/2;
        System.out.println("the number of possible handshakes are "+ maxNumOfHandshakes);
    }
}
