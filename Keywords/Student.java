package Keywords;

class Student {
    // Static variables
    static String universityName = "Delhi University";
    static int totalStudents = 0;

    // Final variable (unique roll number cannot be changed)
    final int rollNumber;
    String name;
    char grade;

    // Constructor using "this"
    Student(String name, int rollNumber, char grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }

    // Static method
    static void displayTotalStudents() {
        System.out.println("Total Students in " + universityName + ": " + totalStudents);
    }

    // Method to update grade with instanceof check
    void updateGrade(char newGrade) {
        if (this instanceof Student) {
            this.grade = newGrade;
            System.out.println("Grade updated for " + name + " (Roll No: " + rollNumber + ")");
        }
    }

    // Method to display student details with instanceof check
    void displayDetails() {
        if (this instanceof Student) {
            System.out.println("University: " + universityName);
            System.out.println("Name: " + name);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Grade: " + grade);
        }
    }

    // Main method to test
    public static void main(String[] args) {
        Student s1 = new Student("Raghav", 101, 'A');
        Student s2 = new Student("Aarav", 102, 'B');

        s1.displayDetails();
        System.out.println();
        s2.displayDetails();

        System.out.println();
        Student.displayTotalStudents();

        System.out.println("\n--- Updating Grade ---");
        s2.updateGrade('A');
        s2.displayDetails();
    }
}

