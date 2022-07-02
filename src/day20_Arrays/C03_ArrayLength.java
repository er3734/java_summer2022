package day20_Arrays;

import java.util.Arrays;

public class C03_ArrayLength {
    public static void main(String[] args) {

        int sayilar[]={1,2,3};
        String isimler[]=new String[4];

        System.out.println("sayilar arrayin uzunluğu : "+sayilar.length);
        //String.length methodunda sonu da
        // parantez var array de yok
        System.out.println("isimler arrayin uzunluğu : "+isimler.length);
        System.out.println(Arrays.toString(isimler));

        //isimler arrayinin son elementini yazdırsalım
        System.out.println(isimler[isimler.length-1]);

        System.out.println(isimler[5]);//ArrayIndexOutOfBoundsException

    }
}
