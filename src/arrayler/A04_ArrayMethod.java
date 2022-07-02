package arrayler;

import java.util.Scanner;

public class A04_ArrayMethod {
    public static void mean(int[] arr) {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        System.out.println("ortalama : " +((double)total/arr.length));
    }
        public static void main (String[]args){
            int[] arr2=new int[5];
            Scanner scan=new Scanner(System.in);
            System.out.println("array 2 nin değerlerini girn");
            for (int i = 0; i <arr2.length ; i++) {
               arr2[i]=scan.nextInt();
            }
            mean(arr2);
    }
}



