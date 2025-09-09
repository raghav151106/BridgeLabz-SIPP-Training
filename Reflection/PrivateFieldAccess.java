package Reflection;

import java.lang.reflect.Field;

class Person {
    private int age = 25;
}

public class PrivateFieldAccess {
    public static void main(String[] args) throws Exception {
        Person p = new Person();

        Field field = Person.class.getDeclaredField("age");
        field.setAccessible(true); // bypass private
        System.out.println("Original Age: " + field.get(p));

        field.set(p, 30); // modify
        System.out.println("Modified Age: " + field.get(p));
    }
}

