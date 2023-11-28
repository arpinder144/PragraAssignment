package assignmethods;

import java.util.Scanner;

public class FactOfNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("given number:");
        int number=sc.nextInt();
        System.out.println("Factorial of "+number+":"+fact(number));

    }
    public static int fact(int number){
        int mul=1;
        while (number>0){
            mul *=number;
            number--;
        }
        return mul;
    }
}
