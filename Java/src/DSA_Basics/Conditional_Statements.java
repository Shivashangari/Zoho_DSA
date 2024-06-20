package DSA_Basics;

import java.util.Scanner;

public class Conditional_Statements {
    public void if_Statements() {
        int input = 101;
        if (input % 2 == 0) {
            System.out.println("The input is even");
        } else {
            System.out.println("The input is ODD");
        }
    }

    public void nestedIf() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the input number here: ");
        int input = scanner.nextInt();
        if (input > 0) {
            System.out.println("The given input integer is Positive(+)");
        } else if (input < 0) {
            System.out.println("The given input integer is Negative(-)");
        } else {
            System.out.println("The Given input is Zero(==0)");
        }

    }

    public void largestOfThreeNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The three numbers:");
        int input1 = scanner.nextInt();
        int input2 = scanner.nextInt();
        int input3 = scanner.nextInt();

        if (input1 > input2 && input1 > input3) {
            System.out.println(input1 + " is greater than the rest of the two numbers");
        } else if (input2 > input1 && input2 > input3) {
            System.out.println(input2 + " is greater than the rest of the two numbers");
        } else {
            System.out.println(input3 + " is greater than the rest of the two numbers");
        }

    }

    public void nestedIf_conditions() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to identify the week day:");
        int input1 = scanner.nextInt();

        if (input1 == 1) {
            System.out.println("Monday");
        } else if (input1 == 2) {
            System.out.println("Tuesday");
        } else if (input1 == 3) {
            System.out.println("Wednesday");
        } else if (input1 == 4) {
            System.out.println("Thursday");
        } else if (input1 == 5) {
            System.out.println("Friday");
        } else if (input1 == 6) {
            System.out.println("Saturday");
        } else if (input1 == 7) {
            System.out.println("Sunday");
        } else {
            System.out.println("Not a week day");
        }

    }


    public void switchCase() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to identify the week day:");
        int input1 = scanner.nextInt();

        switch (input1) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("The input value is not a Week Day");

        }
    }

    public static void main(String[] args) {
        Conditional_Statements conditionalStatements = new Conditional_Statements();
        //conditionalStatements.if_Statements();
        //conditionalStatements.nestedIf();\
        //conditionalStatements.largestOfThreeNumbers();
        //conditionalStatements.nestedIf_conditions();
        conditionalStatements.switchCase();
    }

}
