package DSA_Basics;

public class ReverseString {
    public static void main(String[] args) {
        String name = "Pooja";
        String reverse = " ";
       for (int i=name.length()-1; i>=0; i--){
            System.out.println(name.charAt(i));
           reverse=reverse+name.charAt(i);
       }
        System.out.println(reverse);
        }
    }

