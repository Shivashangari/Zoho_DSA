package Zoho;

import java.util.HashMap;

public class Isomorphic {
    public boolean isomorphicString(String str1, String str2) {
        HashMap<Character, Character> map = new HashMap<>();

        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) { // Corrected loop condition
            char key = str1.charAt(i);
            char value = str2.charAt(i);
            if (map.containsKey(key)) {
                if (map.get(key) == value) {
                    continue;
                }
                return false;
            }

            if (map.containsValue(value)) {
                return false;

            }
            map.put(key, value);
        }

        return true;
    }

    public static void main(String[] args) {
        Isomorphic isomorphic = new Isomorphic();
        String str1 = "egg";
        String str2 = "add";

        boolean result = isomorphic.isomorphicString(str1, str2);
        System.out.println("Are the strings isomorphic? " + result);
    }
}
