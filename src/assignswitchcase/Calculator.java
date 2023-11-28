package assignswitchcase;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first value:");
        double num1= sc.nextDouble();
        System.out.println("enter Second value");
        double num2= sc.nextDouble();
        System.out.println("Welcome to Calculator!");
        System.out.println("Press 1: for Addition");
        System.out.println("Press 2: for Subtraction");
        System.out.println("Press 3: for Multiplication");
        System.out.println("Press 4: for Division");
        int cal= sc.nextInt();
        switch (cal){
            case 1:
                System.out.println("Addition :"+(num1+num2));
                break;
            case 2:
                System.out.println("Subtraction :"+(num1-num2));
                break;
            case 3:
                System.out.println("Multiplication :"+(num1*num2));
                break;
            case 4:
                System.out.println("Division :"+(num1/num2));
                break;
            default:
                System.out.println("Invalid Selection");
        }
    }
}
