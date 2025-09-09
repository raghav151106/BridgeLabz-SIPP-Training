package LinearBinarySearch;

public class CompareBufferBuilder {
    public static void main(String[] args) {
        int n = 1000000; // 1 million

        // StringBuilder
        long start1 = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append("hello");
        }
        long end1 = System.nanoTime();
        System.out.println("StringBuilder Time: " + (end1 - start1) + " ns");

        // StringBuffer
        long start2 = System.nanoTime();
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < n; i++) {
            sbf.append("hello");
        }
        long end2 = System.nanoTime();
        System.out.println("StringBuffer Time: " + (end2 - start2) + " ns");
    }
}

