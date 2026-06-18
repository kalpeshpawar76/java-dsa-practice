package operators;

public class Arithmeticopearator {

    public static void main(String[] args) {
        int a = 10;
        int b = 3;

        System.out.println("=== 1. Arithmetic Operators ===");
        System.out.println("Addition (a + b): " + (a + b));
        System.out.println("Remainder / Modulo (a % b): " + (a % b)); // 10 divided by 3 leaves a remainder of 1

        System.out.println("\n=== 2. Relational Operators ===");
        System.out.println("Is 'a' greater than 'b'? " + (a > b));
        System.out.println("Is 'a' exactly equal to 'b'? " + (a == b));

        System.out.println("\n=== 3. Logical Operators ===");
        boolean isEmailVerified = true;
        boolean isPhoneNumberVerified = false;

        // Logical OR (||) needs only one condition to be true
        boolean canLogin = isEmailVerified || isPhoneNumberVerified;
        System.out.println("Can user log in? " + canLogin);

        // Logical AND (&&) needs both conditions to be true
        boolean isFullySecure = isEmailVerified && isPhoneNumberVerified;
        System.out.println("Is the account fully verified? " + isFullySecure);
    }
}
