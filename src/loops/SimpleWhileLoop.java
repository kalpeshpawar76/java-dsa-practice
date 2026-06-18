package loops;

public class SimpleWhileLoop {
    public static void main(String[] args) {
        int count = 5; // 1. Initialize our control variable

        // 2. Loop runs as long as count is greater than 0
        while (count > 0) {
            System.out.println("Countdown: " + count);

            count--; // 3. Decrement the variable so the loop eventually stops!
        }

        System.out.println("Blast off! Loop finished.");
    }


}
