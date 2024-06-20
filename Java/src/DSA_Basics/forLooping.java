package DSA_Basics;

public class forLooping {
    //1 to 10 number using for loop
    public void printTenNumbers() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    //print even number
    public void evenNumbers() {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " Even");
            } else {
                System.out.println(i + " Odd");
            }
        }


    }

    public void descendingNumber() {
        for (int i = 10; i >= 1 ; i--) {
            System.out.println(i);
        }

    }

    public static void main(String[] args) {
        forLooping obj = new forLooping();
        //obj.printTenNumbers();
        //obj.evenNumbers();
        obj.descendingNumber();

    }

}
