package alistirmaSayfam02;

import java.util.Arrays;

public class A10_BinarySearch {
    public static void main(String[] args) {
        int sayilar[]={1,4,3,2,7,6,3,9,8,11};
        Arrays.sort(sayilar);
        System.out.println(Arrays.toString(sayilar));
        System.out.println(Arrays.binarySearch(sayilar,8));
        System.out.println(Arrays.binarySearch(sayilar,5));
        System.out.println(Arrays.binarySearch(sayilar,11));
        System.out.println(Arrays.binarySearch(sayilar,0));
    }
}
