package assignoverloadmethods;

import java.util.Scanner;

public class AdditionOverload {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number1:");
        double number1= sc.nextDouble();
        System.out.println("enter number2:");
        double number2= sc.nextDouble();
        System.out.println("enter number3:");
        double number3= sc.nextDouble();
        System.out.println("Sum of two number:"+number1+"+ "+number2+"="+
                area(number1,number2));
        System.out.println("Sum of three numbers: "+number1+"+"+number2+"+"+number3+"="+
                area(number1,number2,number3));

    }
    public static double area(double number1,double number2){
        return number1+number2;
    }
    public static double area(double number1,double number2,double number3){
        return number1+number2+number3;
    }
}
