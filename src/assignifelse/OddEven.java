package assignifelse;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number:");
        int input= sc.nextInt();
        if (input%2==0){
            System.out.println("Given number is 'Even'");
        }else{
            System.out.println("Given number is 'Odd'");
        }
    }
}
