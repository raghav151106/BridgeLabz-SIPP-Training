package Reflection;

import java.lang.reflect.Method;

class Calculator {
    private int multiply(int a, int b) {
        return a * b;
    }
}

public class PrivateMethodInvoke {
    public static void main(String[] args) throws Exception {
        Calculator calc = new Calculator();

        Method method = Calculator.class.getDeclaredMethod("multiply", int.class, int.class);
        method.setAccessible(true); // allow private access

        int result = (int) method.invoke(calc, 5, 6);
        System.out.println("Result of multiply: " + result);
    }
}

