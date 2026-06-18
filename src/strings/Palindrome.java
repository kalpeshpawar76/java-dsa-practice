package strings;


public class Palindrome {

    public static void main(String[] args) {

        String s = "madam";

        s = s.toLowerCase();

        char[] arr = s.toCharArray();

        int left = 0;
        int right = arr.length - 1;
        boolean isPalin = true;

        while (left < right) {
            if (arr[left] != arr[right]) {
                isPalin = false;
                break;
            }
            left++;
            right--;
        }
        // Step 5: result
        if (isPalin)
            System.out.println(
                    "Palindrome ✅");
        else
            System.out.println(
                    "Not Palindrome ❌");
    }
}
