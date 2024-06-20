package Zoho;

public class NonRepeatingCharacter {
    public void findNonChar(String str){
        for(int i=1; i<str.length();i++){
            if(str.charAt(i)!=str.charAt(i-1)){
                System.out.println(str.charAt(i));
            }
            else System.out.println("There are char that are repeating");
        }
    }

    public static void main(String[] args) {
        NonRepeatingCharacter nonRepeatingCharacter=new NonRepeatingCharacter();
        nonRepeatingCharacter.findNonChar("hello");
    }
}
