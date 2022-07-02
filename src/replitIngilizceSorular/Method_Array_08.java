package replitIngilizceSorular;

import arrayler.A07ArrayList;

import java.util.Arrays;

public class Method_Array_08 {
    public static void main(String[] args) {
       /* 2 tamsayı Diziyi parametre olarak kabul eden ve yeni bir Diziye 2 dizi ekleyen ve yazdıran bir dönüş yöntemi yazın.

        Girdi1={1,2,3,4,}

        Giriş2={5,6}

        Çıktı={1,2,3,4,5,6}*/

        int dizi1[]={1,2,3,4,9,0};
        int dizi2[]={5,6,7,8};
        int ydizi[]=new int[dizi1.length+dizi2.length];
        for (int i = 0; i <dizi1.length ; i++) {
            ydizi[i]=dizi1[i];
        }
        int a=0;
        for (int i = dizi1.length; i <ydizi.length ; i++) {
            ;
            ydizi[i]=dizi2[a];
            a++;
        }
        System.out.println(Arrays.toString(ydizi));
    }
}
