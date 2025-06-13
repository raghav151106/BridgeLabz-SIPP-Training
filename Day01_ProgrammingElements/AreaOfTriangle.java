package Day01_ProgrammingElements;
import java.util.Scanner;
public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        float base= sc.nextFloat();
        float height= sc.nextFloat();
       double areaInCm= 0.5 * base * height;

        double  areaInInches= (float)areaInCm /2.54;
        System.out.println("The Area of the triangle in sq in is "+areaInInches+ " and sq cm is"+areaInCm);
    }

}
