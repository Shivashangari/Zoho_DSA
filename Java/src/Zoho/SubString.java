package Zoho;

public class SubString {
    public int checkIsSubString() {
        String input1 = "GeeksForGeeks";
        String input2 = "Fo"; // Remove leading and trailing spaces
        int i, j;

        for (i = 0; i <= input1.length() - input2.length(); i++) {
            // Check for a match starting from index i in input1
            for (j = 0; j < input2.length(); j++) {
                if (input1.charAt(i + j) != input2.charAt(j)) {

                    break;
                }
            }
            // If all characters of input2 match the substring starting from index i in input1, return i
            if (j == input2.length()) {
                return i;
            }
        }
        // If no match is found, return -1
        return -1;
    }

    public static void main(String[] args) {
        SubString subString = new SubString();
        int result = subString.checkIsSubString();
        if (result != -1) {
            System.out.println("Substring found at index: " + result);
        } else {
            System.out.println("Substring not found");
        }
    }
}
