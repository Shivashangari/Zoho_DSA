package Zoho.Strings;

public class ReadCharByChar {
    public void read() {
        int count=0;
        String str = "Its Simple";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i); //to get the character seperately
            System.out.println(ch);

            System.out.println(ch + " " + (int) ch);//print the ASCII code
            //Print only the upper case character

            //we have methods to check .isLowerCase(), .isDigit(), .LetterDigit();
            if (Character.isUpperCase(ch)) {
                count++;
                System.out.println("The strings are in Upper case: " + ch+"Count:"+count);

            }
        }
    }

    public static void main(String[] args) {
        ReadCharByChar readCharByChar = new ReadCharByChar();
        readCharByChar.read();
    }
}
