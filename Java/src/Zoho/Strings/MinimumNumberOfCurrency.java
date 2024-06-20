package Zoho.Strings;

import java.util.HashMap;
import java.util.Map;

public class MinimumNumberOfCurrency {


    public static void findMinimumNotes(int amount) {
        int[] denominations = {2000, 500, 200, 100, 50, 20, 10, 5, 1};
        Map<Integer, Integer> noteCounts = new HashMap<>();

        for (int denomination : denominations) {
            int count = amount / denomination;
            if (count > 0) {
                noteCounts.put(denomination, count);
                amount -= count * denomination;
            }
        }

        System.out.println("Currency  Count");
        for (Map.Entry<Integer, Integer> entry : noteCounts.entrySet()) {
            System.out.println("   " + entry.getKey() + " : " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        int amount1 = 800;
        int amount2 = 2456;

        System.out.println("Input : " + amount1);
        System.out.println("Output :");
        findMinimumNotes(amount1);

        System.out.println("\nInput : " + amount2);
        System.out.println("Output :");
        findMinimumNotes(amount2);
    }
}

