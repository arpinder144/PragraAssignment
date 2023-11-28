package assignloops;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number for factorial:");
        int n= sc.nextInt();
        int mul=1;
        while (n>=1){
            mul*=n;
            n--;

        }
        System.out.println("Factorial of given number:"+ mul);
    }
}
