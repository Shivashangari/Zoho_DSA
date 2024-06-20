package Zoho;

import java.util.Scanner;

public class Palindrome {

    public static void checkBoolean(){
        int number=122;
        String convertNumberToString=Integer.toString(number);
        System.out.println(convertNumberToString);

        //Reverse the string
        String reverse= String.valueOf(new StringBuilder(number).reverse());
        System.out.println(reverse);

        //check the palindrome
        if(reverse == convertNumberToString){
            System.out.println(convertNumberToString+" The number is Palindrome");
        }
        else {
            System.out.println(convertNumberToString+" The number is not palindrome");
        }
    }

    public static void main(String[] args) {
        checkBoolean();
    }
}

