package operators;

public class Bitwise {


        public static void main(String[] args) {
            int a = 5;  // Binary: 0101
            int b = 3;  // Binary: 0011

            System.out.println("--- Bitwise Logical Operators ---");

            // 1. Bitwise AND (&): 1 if both bits are 1
            // 0101 & 0011 = 0001 (1)
            System.out.println("a & b = " + (a & b));

            // 2. Bitwise OR (|): 1 if at least one bit is 1
            // 0101 | 0011 = 0111 (7)
            System.out.println("a | b = " + (a | b));

            // 3. Bitwise XOR (^): 1 if bits are different
            // 0101 ^ 0011 = 0110 (6)
            System.out.println("a ^ b = " + (a ^ b));

            // 4. Bitwise NOT (~): Inverts all bits (2's complement negation)
            // ~00000101 = 11111010 (-6)
            System.out.println("~a    = " + (~a));


            System.out.println("\n--- Bit Shift Operators ---");

            int x = 12;  // Binary: 0000 1100
            int y = -12; // Binary: 1111 0100 (In 2's complement)

            // 5. Left Shift (<<): Shifts bits left, fills with 0 (Multiplies by 2^n)
            // 12 << 2 = 48
            System.out.println("12 << 2  = " + (x << 2));

            // 6. Right Shift (>>): Shifts bits right, preserves sign bit (Divides by 2^n)
            // 12 >> 2 = 3
            System.out.println("12 >> 2  = " + (x >> 2));
            // -12 >> 2 = -3
            System.out.println("-12 >> 2 = " + (y >> 2));

            // 7. Unsigned Right Shift (>>>): Shifts right, always fills left with 0
            // Yields a huge positive number for negatives because sign bit becomes 0
            System.out.println("-12 >>> 2 = " + (y >>> 2));


            System.out.println("\n--- Real-World Interview Tricks ---");

            // Fast Even/Odd check
            int num = 43;
            if ((num & 1) == 0) {
                System.out.println(num + " is Even");
            } else {
                System.out.println(num + " is Odd");
            }

            // Swapping two numbers without a temporary variable using XOR
            int m = 10, n = 20;
            m = m ^ n;
            n = m ^ n; // n becomes 10
            m = m ^ n; // m becomes 20
            System.out.println("After swap -> m: " + m + ", n: " + n);
        }
}

