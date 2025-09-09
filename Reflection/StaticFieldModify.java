package Reflection;

import java.lang.reflect.Field;

class Configuration {
    private static String API_KEY = "OLD_KEY";
}

public class StaticFieldModify {
    public static void main(String[] args) throws Exception {
        Field field = Configuration.class.getDeclaredField("API_KEY");
        field.setAccessible(true);

        System.out.println("Original API_KEY: " + field.get(null));

        field.set(null, "NEW_SECRET_KEY"); // modify static field
        System.out.println("Modified API_KEY: " + field.get(null));
    }
}

