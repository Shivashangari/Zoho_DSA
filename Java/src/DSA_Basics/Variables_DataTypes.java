package DSA_Basics;

import java.util.Scanner;

public class Variables_DataTypes {

    public void dataTypes() {
        int number1 = 20;
        float number2 = 1.8f;
        String name = "Pooja";
        System.out.println("Printing the numbers 1 :" + number1);
        System.out.println("Printing the number2 :" + number2);
        System.out.println("Printing the name:" + name);

    }

    public void matoperations() {
        int number1 = 200;
        int number2 = 300;

        System.out.println("Addition: " + number1 + "+" + number2 + "=" + (number1 + number2));
        System.out.println("Subtraction: " + number1 + "-" + number2 + "=" + (number1 - number2));
        System.out.println("Multiply: " + number1 + "*" + number2 + "=" + (number1 * number2));
        System.out.println("Division: " + number1 + "/" + number2 + "=" + (number1 | number2));

    }

    public void conCat() {
        String name1 = "Pooja";
        String name2 = "chandrasekar";
        System.out.println(name1 + name2);
    }

    public void printAge() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your age here:");
        int age = scanner.nextInt();
        System.out.println("You are " + age + " years old");
        scanner.close();

    }


    public void oddOrEven(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the input number here: ");
        int input1=scanner.nextInt();


        if (input1%2 == 0){
            System.out.println("It is even");
        }
        else System.out.println("The input is odd");


    }


    public void findTheLastDigit(){
         String a="2";
        String  b="10";

        //parse string to int
        int a1= Integer.parseInt(a);
        int b1= Integer.parseInt(b);


        //using Math.pow calculating the result ^
        long Result=(long)Math.pow(a1,b1);
        System.out.println(Result);

        //Calculating the last digit
        long finalResult= Result%10;
        System.out.println(finalResult);


    }


    public static void main(String[] args) {
        Variables_DataTypes obj = new Variables_DataTypes();
//        obj.dataTypes();
//        obj.matoperations();
//        obj.conCat();
//        obj.printAge();
        obj.oddOrEven();
        obj.findTheLastDigit();
    }

}