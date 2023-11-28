package assignifelse;

import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number:");
        int num1= sc.nextInt();
        System.out.println("Enter Second number:");
        int num2= sc.nextInt();
        System.out.println("Enter Third number:");
        int num3= sc.nextInt();

        if(num1>num2 && num1>num3){
            System.out.println("First number is greater");
        }else if(num2>num3){
            System.out.println("Second number is greater");
        }else{
            System.out.println("Third number is greater");
        }
    }
}
