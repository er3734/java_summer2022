package alistirmaSayfam02;

import java.util.Arrays;

public class A11_ArrayEquals {
    public static void main(String[] args) {
        int num[]={2,3,6,1,8};
        int num2[]={3,2,8,6,1};
        System.out.println(Arrays.equals(num,num2));
        Arrays.sort(num);
        Arrays.sort(num2);
        System.out.println(Arrays.equals(num,num2));
        String harf[]={"ali","veli","deli",};
        String harf2[]={"ali","deli","veli"};
        System.out.println(Arrays.equals(harf,harf2));
        Arrays.sort(harf);
        Arrays.sort(harf2);
        System.out.println(Arrays.equals(harf,harf2));
    }
}
