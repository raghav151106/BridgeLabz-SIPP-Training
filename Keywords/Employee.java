package Keywords;

class Employee {
    // Static variable shared by all employees
    static String companyName = "Tech Solutions Pvt Ltd";
    static int totalEmployees = 0;

    // Final variable (unique and cannot be changed)
    final int id;
    String name;
    String designation;

    // Constructor using "this"
    Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }

    // Static method
    static void displayTotalEmployees() {
        System.out.println("Total Employees in " + companyName + ": " + totalEmployees);
    }

    // Display details with instanceof check
    void displayDetails() {
        if (this instanceof Employee) {
            System.out.println("Company: " + companyName);
            System.out.println("Employee ID: " + id);
            System.out.println("Name: " + name);
            System.out.println("Designation: " + designation);
        }
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Raghav", 101, "Software Engineer");
        Employee e2 = new Employee("Aarav", 102, "Team Lead");

        e1.displayDetails();
        System.out.println();
        e2.displayDetails();

        System.out.println();
        Employee.displayTotalEmployees();
    }
}

