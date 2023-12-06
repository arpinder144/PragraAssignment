package stringassign;

import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any String:");
        String input= sc.nextLine();
        char[] arrCh=input.toCharArray();
        for (char element:arrCh
             ) {
            System.out.println(element);

        }
        char temp;
        int a=arrCh.length;
        for (int i = 0; i < a/2; i++) {
            temp=arrCh[i];
            arrCh[i]=arrCh[a-1];
            arrCh[a-1]=temp;
            a--;
        }
        for (char element:arrCh
        ) {
            System.out.println("  "+element);
        }

        char[] newArray=new char[arrCh.length];
        for (int i = 0; i < newArray.length ; i++) {
            newArray[i]=arrCh[i];
        }
        System.out.println("new array:");
        for (char element:newArray
        ) {
            System.out.println("  "+element);
        }




    }

}
