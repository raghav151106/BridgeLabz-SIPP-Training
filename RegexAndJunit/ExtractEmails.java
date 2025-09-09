package RegexAndJunit;

import java.util.regex.*;
import java.util.*;

public class ExtractEmails {
    public static void main(String[] args) {
        String text = "Contact us at support@example.com and info@company.org";
        Pattern pattern = Pattern.compile("[\\w._%+-]+@[\\w.-]+\\.[A-Za-z]{2,6}");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}

