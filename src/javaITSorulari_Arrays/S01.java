package javaITSorulari_Arrays;

import java.util.Arrays;

public class S01 {
    public static void main(String[] args) {
        //Bir tamsayı dizisinde ortadaki elemanı bulun
        int[ ] a = new  int[ ]{12, 5,4};

        Arrays.sort(a);

        if (a.length%2==0){
            System.out.println((a[a.length/2-1]+a[a.length/2])/2);
        }else {
            System.out.println(a[a.length / 2]);
        }
    }
}
