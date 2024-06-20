package Zoho.Strings;

import java.util.*;

public class DistinctArray {
    public static List<Integer> distinctDigits(int[] nums) {
        Set<Integer> distinctSet = new HashSet<>();
        for (int num : nums) {
            while (num > 0) {
                int digit = num % 10;
                distinctSet.add(digit);
                num /= 10;
            }
        }
        List<Integer> distinctList = new ArrayList<>(distinctSet);
        Collections.sort(distinctList);
        return distinctList;
    }

    public static void main(String[] args) {
        int[] nums1 = {131, 11, 48};
        int[] nums2 = {111, 222, 333, 4444, 666};

        System.out.println("Example 1: " + distinctDigits(nums1));  // Output: [1, 3, 4, 8]
        System.out.println("Example 2: " + distinctDigits(nums2));  // Output: [1, 2, 3, 4, 6]
    }
}

