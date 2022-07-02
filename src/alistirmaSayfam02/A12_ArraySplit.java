package alistirmaSayfam02;

import java.util.Arrays;

public class A12_ArraySplit {
    public static void main(String[] args) {
        String str="Java ogrenmek, IT alaninda yer edinmek demektir";
        String arr[]= str.split(",");
        System.out.println(Arrays.toString(arr));
        String arr2[]=str.split(" ");
        System.out.println(Arrays.toString(arr2));
        String arr3[]=str.split("");
        System.out.println(Arrays.toString(arr3));
        System.out.println(arr.length);
        System.out.println(arr2.length);
        System.out.println(arr3.length);
    }
}
