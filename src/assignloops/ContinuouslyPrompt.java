package assignloops;

import java.util.Scanner;

public class ContinuouslyPrompt {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input;

        do{
            System.out.println("Enter any value:");
            input=sc.nextLine();
            System.out.println("Value entered:"+input);
        }while(!(input.equalsIgnoreCase("q")));
        System.out.println("quite");
    }
}
