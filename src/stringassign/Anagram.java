package stringassign;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        String str1="Heart";
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any String:");
        String str2=sc.nextLine();
        char[] arr1=str1.toLowerCase().toCharArray();
        char[] arr2=str2.toLowerCase().toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if(Arrays.equals(arr1,arr2)){
            System.out.println("String is Anagram");
        }
        else {
            System.out.println("String is not Anagram");
        }
    }
}
