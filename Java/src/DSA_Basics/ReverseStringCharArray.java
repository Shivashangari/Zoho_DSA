package DSA_Basics;

public class ReverseStringCharArray {
    public static void main(String[] args) {
        String name="Poooja";
        String rev=""; //empty string variable
        char[] a =name.toCharArray(); //changing a sting to char[]
        System.out.println(a);
        for (int i=a.length-1;i>=0;i--){ //reverse loop
            System.out.println(a[i]);
            rev=rev+a[i]; //adding the reverse array into the empty string
            System.out.println(rev); //printing the reversed array
        }
    }
}
