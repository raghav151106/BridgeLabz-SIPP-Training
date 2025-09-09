package BuiltInFunction;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TimeZonesExample {
    public static void main(String[] args) {
        // Current time in different zones
        ZonedDateTime gmt = ZonedDateTime.now(ZoneId.of("GMT"));
        ZonedDateTime ist = ZonedDateTime.now(ZoneId.of("Asia/Kolkata")); // IST
        ZonedDateTime pst = ZonedDateTime.now(ZoneId.of("America/Los_Angeles")); // PST

        System.out.println("Current GMT Time : " + gmt);
        System.out.println("Current IST Time : " + ist);
        System.out.println("Current PST Time : " + pst);
    }
}

