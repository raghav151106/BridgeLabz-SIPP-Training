package Day01_ProgrammingElements;
import java.util.Scanner;
public class PerimeterOfSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int parameter= sc.nextInt();
        int side= parameter/4;
        System.out.println("The length of the side is "+side+"whose perimeter is "+parameter);

    }
}
