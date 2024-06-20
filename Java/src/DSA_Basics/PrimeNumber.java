package DSA_Basics;

public class PrimeNumber {
    public static void main(String[] args) {
        int number = 97;
        boolean isprime = true;
        for (int i = 2; i <= number; i++) {
            if (number % i == 0) {
                isprime = false;
                System.out.println(isprime);
                break;
            } else {
                System.out.println(isprime);
                break;
            }
        }

    }
}
