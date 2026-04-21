package lab2;

public class PerformanceTest {
    public static void main(String[] args) {

        // Test StringBuffer
        long startTime = System.nanoTime();
        StringBuffer sbf = new StringBuffer();

        for (int i = 0; i < 10000; i++) {
            sbf.append("AIET");
        }

        long endTime = System.nanoTime();
        System.out.println("Time taken by StringBuffer: " + (endTime - startTime) + " ns");

        // Test StringBuilder
        long startTime2 = System.nanoTime();
        StringBuilder sbd = new StringBuilder();

        for (int i = 0; i < 10000; i++) {
            sbd.append("AIET");
        }

        long endTime2 = System.nanoTime();
        System.out.println("Time taken by StringBuilder: " + (endTime2 - startTime2) + " ns");
    }
}