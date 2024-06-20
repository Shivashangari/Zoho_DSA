package DSA_Basics;

public class PalindromString {
    public void palindrome(){
        String palindrome="aabbaa";
        for(int i =palindrome.length()-1;i<=0 ; i++){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        PalindromString palindromString=new PalindromString();
        palindromString.palindrome();
    }
}
