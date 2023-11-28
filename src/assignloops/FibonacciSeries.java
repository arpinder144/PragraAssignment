package assignloops;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n value:");
        int endValue= sc.nextInt();
        int num1=0;
        int num2=1;
        System.out.println("Fibonacci Series:");
        System.out.println(num1);
        System.out.println(num2);
        for (int num3=1; num3<=endValue ;num3++){
            num3=num1+num2;
            System.out.println(num3);
            num1=num2;
            num2=num3;


        }
    }
}
