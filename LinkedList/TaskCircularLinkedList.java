package LinkedList;

class Task {
    int taskID;
    String taskName;
    String priority;
    String dueDate;
    Task next;

    Task(int taskID, String taskName, String priority, String dueDate) {
        this.taskID = taskID;
        this.taskName = taskName;
        this.priority = priority;
        this.dueDate = dueDate;
    }
}

class TaskCircularLinkedList {
    Task head = null, tail = null, current = null;

    // Add at end
    void addTask(int taskID, String taskName, String priority, String dueDate) {
        Task newTask = new Task(taskID, taskName, priority, dueDate);
        if (head == null) {
            head = tail = newTask;
            newTask.next = head;
        } else {
            tail.next = newTask;
            newTask.next = head;
            tail = newTask;
        }
    }

    // Delete by TaskID
    void deleteTask(int taskID) {
        if (head == null) return;

        Task temp = head, prev = null;
        do {
            if (temp.taskID == taskID) {
                if (temp == head) {
                    head = head.next;
                    tail.next = head;
                } else if (temp == tail) {
                    tail = prev;
                    tail.next = head;
                } else {
                    prev.next = temp.next;
                }
                System.out.println("Task " + taskID + " deleted.");
                return;
            }
            prev = temp;
            temp = temp.next;
        } while (temp != head);
        System.out.println("Task not found.");
    }

    // View current task
    void viewCurrentTask() {
        if (current == null) current = head;
        System.out.println("Current Task: " + current.taskName + " | Priority: " + current.priority);
    }

    // Move to next task
    void moveToNextTask() {
        if (current != null) current = current.next;
    }

    // Display all
    void displayAll() {
        if (head == null) return;
        Task temp = head;
        do {
            System.out.println(temp.taskID + " | " + temp.taskName + " | " + temp.priority + " | " + temp.dueDate);
            temp = temp.next;
        } while (temp != head);
    }

    // Search by priority
    void searchByPriority(String priority) {
        if (head == null) return;
        Task temp = head;
        do {
            if (temp.priority.equals(priority))
                System.out.println("Found Task: " + temp.taskName + " (Priority: " + priority + ")");
            temp = temp.next;
        } while (temp != head);
    }

    public static void main(String[] args) {
        TaskCircularLinkedList scheduler = new TaskCircularLinkedList();
        scheduler.addTask(1, "Project Report", "High", "10-09-2025");
        scheduler.addTask(2, "Presentation", "Medium", "12-09-2025");
        scheduler.addTask(3, "Code Review", "Low", "15-09-2025");

        System.out.println("All Tasks:");
        scheduler.displayAll();

        System.out.println("\nView current task:");
        scheduler.viewCurrentTask();

        System.out.println("\nMove to next task:");
        scheduler.moveToNextTask();
        scheduler.viewCurrentTask();

        System.out.println("\nSearch by Priority (High):");}}


