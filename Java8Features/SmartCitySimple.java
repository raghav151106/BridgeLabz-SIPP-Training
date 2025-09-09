package Java8Features;

import java.util.*;
import java.util.stream.*;

// Functional Interface
@FunctionalInterface
interface FareCalculator {
    double calculateFare(double baseFare, double distance);
}

// Marker Interface
interface EmergencyService {}

// Main Transport Service Interface
interface TransportService {
    String getName();
    double getFare();

    // Default method
    default void printServiceDetails() {
        System.out.println("Service: " + getName() + " | Fare: " + getFare());
    }

    // Static method
    static double calculateDistance(String from, String to) {
        return Math.abs(from.length() - to.length()) + 1; // dummy formula
    }
}

// Implementations
class BusService implements TransportService {
    private String name;
    private double fare;
    BusService(String name, double fare) { this.name = name; this.fare = fare; }
    public String getName() { return name; }
    public double getFare() { return fare; }
}

class TaxiService implements TransportService {
    private String name;
    private double baseFare;
    FareCalculator fareCalc;
    TaxiService(String name, double baseFare, FareCalculator fareCalc) {
        this.name = name; this.baseFare = baseFare; this.fareCalc = fareCalc;
    }
    public String getName() { return name; }
    public double getFare() { return fareCalc.calculateFare(baseFare, 5); } // assume 5 km
}

class AmbulanceService implements TransportService, EmergencyService {
    public String getName() { return "Ambulance"; }
    public double getFare() { return 0; }
    @Override
    public void printServiceDetails() {
        System.out.println("🚑 EMERGENCY: " + getName());
    }
}

public class SmartCitySimple {
    public static void main(String[] args) {
        // Create services
        TransportService bus = new BusService("Bus A", 20);
        TransportService taxi = new TaxiService("Taxi X", 50, (base, dist) -> base + dist*10);
        TransportService ambulance = new AmbulanceService();

        List<TransportService> services = Arrays.asList(bus, taxi, ambulance);

        // 1. Show details using default method + method reference
        System.out.println("\n--- All Services ---");
        services.forEach(TransportService::printServiceDetails);

        // 2. Filter & sort using Lambda + Stream
        System.out.println("\n--- Sorted by Fare ---");
        services.stream()
                .sorted(Comparator.comparingDouble(TransportService::getFare))
                .forEach(s -> System.out.println(s.getName() + " => " + s.getFare()));

        // 3. Detect emergency using Marker Interface
        System.out.println("\n--- Emergency Check ---");
        services.stream()
                .filter(s -> s instanceof EmergencyService)
                .forEach(s -> System.out.println(s.getName() + " is Emergency Service"));

        // 4. Use static method for distance
        double dist = TransportService.calculateDistance("Central", "Airport");
        System.out.println("\nDistance Central -> Airport = " + dist + " km");
    }
}

