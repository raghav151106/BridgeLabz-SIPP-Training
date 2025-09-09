package LambdaExpressions;

import java.util.*;

public class PatientIDPrinter {
    public static void main(String[] args) {
        List<Integer> patientIDs = Arrays.asList(101, 102, 103, 104);

        // Using method reference to print
        patientIDs.forEach(System.out::println);
    }
}

