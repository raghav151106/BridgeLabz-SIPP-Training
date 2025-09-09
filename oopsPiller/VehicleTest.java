package oopsPiller;

import java.util.*;

abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;

    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    public String getVehicleNumber() { return vehicleNumber; }
    public String getType() { return type; }
    public double getRentalRate() { return rentalRate; }

    public abstract double calculateRentalCost(int days);
}

interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}

class Car extends Vehicle implements Insurable {
    public Car(String num, double rate) { super(num, "Car", rate); }

    @Override
    public double calculateRentalCost(int days) { return getRentalRate() * days; }

    @Override
    public double calculateInsurance() { return 5000; }

    @Override
    public String getInsuranceDetails() { return "Car insurance fixed: 5000"; }
}

class Bike extends Vehicle implements Insurable {
    public Bike(String num, double rate) { super(num, "Bike", rate); }

    @Override
    public double calculateRentalCost(int days) { return getRentalRate() * days; }

    @Override
    public double calculateInsurance() { return 1000; }

    @Override
    public String getInsuranceDetails() { return "Bike insurance fixed: 1000"; }
}

class Truck extends Vehicle implements Insurable {
    public Truck(String num, double rate) { super(num, "Truck", rate); }

    @Override
    public double calculateRentalCost(int days) { return getRentalRate() * days; }

    @Override
    public double calculateInsurance() { return 8000; }

    @Override
    public String getInsuranceDetails() { return "Truck insurance fixed: 8000"; }
}

class VehicleTest {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car("C123", 2000));
        vehicles.add(new Bike("B456", 500));
        vehicles.add(new Truck("T789", 4000));

        for (Vehicle v : vehicles) {
            System.out.println(v.getType() + " " + v.getVehicleNumber());
            System.out.println("Rental for 5 days: " + v.calculateRentalCost(5));

            if (v instanceof Insurable) {
                System.out.println(((Insurable) v).getInsuranceDetails());
            }
            System.out.println("------");
        }
    }
}

