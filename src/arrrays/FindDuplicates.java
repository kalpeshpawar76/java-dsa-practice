package arrrays;

import java.util.HashSet;

public class FindDuplicates {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,3,5,4};

        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();

        for(int i = 0; i < arr.length; i++) {
            if (seen.contains(arr[i])) {
                duplicates.add(arr[i]);
            }
            else {
                seen.add(arr[i]);
            }
        }
        System.out.println("Duplicates: " + duplicates);
    }
}
