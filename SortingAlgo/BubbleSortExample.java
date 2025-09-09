package SortingAlgo;

public class BubbleSortExample {
    public static void bubbleSort(int[] marks) {
        int n = marks.length;
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (marks[j] > marks[j + 1]) {
                    int temp = marks[j];
                    marks[j] = marks[j + 1];
                    marks[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break; // Optimization
        }
    }

    public static void main(String[] args) {
        int[] marks = {50, 20, 40, 10, 30};
        bubbleSort(marks);
        System.out.println("Sorted Marks:");
        for (int mark : marks) System.out.print(mark + " ");
    }
}

