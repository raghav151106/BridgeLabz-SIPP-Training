package LambdaExpressions;

import java.util.*;
import java.util.stream.*;

class Invoice {
    int id;

    Invoice(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Invoice ID: " + id;
    }
}

public class InvoiceCreation {
    public static void main(String[] args) {
        List<Integer> transactionIds = Arrays.asList(201, 202, 203);

        // Constructor reference to create Invoice objects
        List<Invoice> invoices = transactionIds.stream()
                .map(Invoice::new)
                .collect(Collectors.toList());

        invoices.forEach(System.out::println);
    }
}

