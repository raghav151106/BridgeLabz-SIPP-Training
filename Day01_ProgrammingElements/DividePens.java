package Day01_ProgrammingElements;

public class DividePens {
    public static void main(String[] args) {
        int pens= 14;
        int numberOfStudents =3;
        int equallyDividedPens= pens/numberOfStudents;
        int remainingPens= pens % numberOfStudents;
        System.out.println("The Pen Per Student is "+equallyDividedPens+" and the remaining pen not distributed is "+remainingPens);
    }
}
