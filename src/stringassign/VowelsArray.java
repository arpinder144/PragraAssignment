package stringassign;

import java.util.Scanner;

public class VowelsArray {
    public static void main(String[] args) {
        int count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any string");
        String str=sc.nextLine();
        char[] arr1=str.toLowerCase().toCharArray();
        for (char element:arr1
             ) {if(element == 'a' || element == 'e' || element == 'i' ||
        element == 'o' || element == 'u'){
            System.out.println("Vowels:   "+element);
            count++;
             }else {
            System.out.println("constrain:   "+element);
        }

        }
        System.out.println("Number of vowels:"+count);
        System.out.println("Number constrains:"+(arr1.length-count));
    }
}
