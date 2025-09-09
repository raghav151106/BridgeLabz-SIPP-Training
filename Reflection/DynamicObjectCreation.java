package Reflection;

class Student {
    public Student() {
        System.out.println("Student object created!");
    }
}

public class DynamicObjectCreation {
    public static void main(String[] args) throws Exception {
        Class<?> clazz = Class.forName("Student");

        // create instance without new
        Object obj = clazz.getDeclaredConstructor().newInstance();

        System.out.println("Instance: " + obj.getClass().getName());
    }
}

