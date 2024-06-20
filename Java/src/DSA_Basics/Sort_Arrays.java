package DSA_Basics;

public class Sort_Arrays {
    public static void main(String[] args) {
        int number1 = 1234;
        int reverse = 0;
        while (number1!=0){
            int remainder= number1%10;
            reverse = reverse*10+remainder;
            number1=number1/10;

            
        }
        System.out.println(reverse);

    }
}
