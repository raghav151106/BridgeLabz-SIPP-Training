package Inheritance;

// Superclass
class Employee {
    String name;
    int id;
    double salary;

    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
    }
}

// Subclass Manager
class Manager extends Employee {
    int teamSize;

    Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Team Size: " + teamSize);
    }
}

// Subclass Developer
class Developer extends Employee {
    String programmingLanguage;

    Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Programming Language: " + programmingLanguage);
    }
}

// Subclass Intern
class Intern extends Employee {
    String mentorName;

    Intern(String name, int id, double salary, String mentorName) {
        super(name, id, salary);
        this.mentorName = mentorName;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Mentor: " + mentorName);
    }
}

// Test class
class EmployeeTest {
    public static void main(String[] args) {
        Employee e1 = new Manager("Raghav", 101, 80000, 5);
        Employee e2 = new Developer("Aarav", 102, 60000, "Java");
        Employee e3 = new Intern("Priya", 103, 20000, "Raghav");

        e1.displayDetails();
        System.out.println();
        e2.displayDetails();
        System.out.println();
        e3.displayDetails();
    }
}

