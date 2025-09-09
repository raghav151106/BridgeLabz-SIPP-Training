package LinkedList;

class Student {
    int rollNo;
    String name;
    int age;
    char grade;
    Student next;

    Student(int rollNo, String name, int age, char grade) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.next = null;
    }
}

class StudentLinkedList {
    Student head;

    // Add at beginning
    void addAtBeginning(int rollNo, String name, int age, char grade) {
        Student newNode = new Student(rollNo, name, age, grade);
        newNode.next = head;
        head = newNode;
    }

    // Add at end
    void addAtEnd(int rollNo, String name, int age, char grade) {
        Student newNode = new Student(rollNo, name, age, grade);
        if (head == null) {
            head = newNode;
            return;
        }
        Student temp = head;
        while (temp.next != null)
            temp = temp.next;
        temp.next = newNode;
    }

    // Add at specific position (1-based index)
    void addAtPosition(int pos, int rollNo, String name, int age, char grade) {
        if (pos == 1) {
            addAtBeginning(rollNo, name, age, grade);
            return;
        }
        Student newNode = new Student(rollNo, name, age, grade);
        Student temp = head;
        for (int i = 1; i < pos - 1 && temp != null; i++)
            temp = temp.next;
        if (temp == null) {
            System.out.println("Position out of range.");
            return;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Delete by roll number
    void deleteByRollNo(int rollNo) {
        if (head == null) return;
        if (head.rollNo == rollNo) {
            head = head.next;
            return;
        }
        Student temp = head;
        while (temp.next != null && temp.next.rollNo != rollNo)
            temp = temp.next;
        if (temp.next == null) {
            System.out.println("Student not found.");
            return;
        }
        temp.next = temp.next.next;
    }

    // Search by roll number
    Student searchByRollNo(int rollNo) {
        Student temp = head;
        while (temp != null) {
            if (temp.rollNo == rollNo) return temp;
            temp = temp.next;
        }
        return null;
    }

    // Update grade
    void updateGrade(int rollNo, char newGrade) {
        Student s = searchByRollNo(rollNo);
        if (s != null) {
            s.grade = newGrade;
            System.out.println("Grade updated.");
        } else {
            System.out.println("Student not found.");
        }
    }

    // Display all
    void displayAll() {
        Student temp = head;
        while (temp != null) {
            System.out.println("RollNo: " + temp.rollNo + ", Name: " + temp.name +
                    ", Age: " + temp.age + ", Grade: " + temp.grade);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        StudentLinkedList list = new StudentLinkedList();
        list.addAtEnd(101, "Raghav", 20, 'A');
        list.addAtBeginning(102, "Aarav", 19, 'B');
        list.addAtPosition(2, 103, "Priya", 21, 'A');

        list.displayAll();
        System.out.println("\nSearching roll no 103:");
        Student s = list.searchByRollNo(103);
        if (s != null) System.out.println("Found: " + s.name);

        System.out.println("\nUpdating grade for roll no 102:");
        list.updateGrade(102, 'A');
        list.displayAll();

        System.out.println("\nDeleting roll no 101:");
        list.deleteByRollNo(101);
        list.displayAll();
    }
}

