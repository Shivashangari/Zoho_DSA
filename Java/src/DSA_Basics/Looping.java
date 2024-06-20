package DSA_Basics;

public class Looping {
    public void whileLoopDemo() {
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
    }

    public void whileExample() {
        String message = "Hello";
        int i = 1;
        while (i <= 10) {
            System.out.println(message);
            i++;
        }

    }

    public void whileLoopDemo2() {
        int i = 1;
        while (i <= 10) {
            if (i % 2 == 0) {
                System.out.println(i + " Even");
            } else {
                System.out.println(i + " Odd");
            }
            i++;
        }

    }

    public void printNumbersDescending(){
        int number=10;
        while (number >= 0){
            System.out.println(number);
            number--;
        }
    }
    public void doWhileLoop(){
        int i=10;

        do{
            System.out.println(i);
            i--;
        }
        while (i>=0);

    }
    public static void main(String[] args) {

        Looping looping = new Looping();
        //looping.whileLoopDemo();
        //looping.whileExample();
        //looping.whileLoopDemo2();
        //looping.printNumbersDescending();
        looping.doWhileLoop();
    }
}
