package Zoho;

public class EncodeAlphabetCount {
    public static String runLengthEncode(String s) {
        if (s == null || s.isEmpty()) {
            return "";
        }

        StringBuilder encodedString = new StringBuilder();
        int count = 1;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) { //checks the current and previous character
                count++; //add count
            } else {
                encodedString.append(s.charAt(i - 1)).append(count);
                count = 1;
            }
        }

        encodedString.append(s.charAt(s.length() - 1)).append(count);

        return encodedString.toString();
    }

    public static void main(String[] args) {
        String inputString = "wwwwaaadexxxxxx";
        String encodedString = runLengthEncode(inputString);
        System.out.println(encodedString);  // Output: "w4a3d1e1x6"
    }
}
