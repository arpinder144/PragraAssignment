package assignifelse;

import java.util.Scanner;

public class VoteSystem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter user's age:");
        int age=sc.nextInt();
        if(age>=18){
            System.out.println("user eligible for VOTE");
        }else{
            System.out.println("user underage, not eligible ");
        }
    }
}
