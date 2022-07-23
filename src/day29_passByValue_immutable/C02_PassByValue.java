package day29_passByValue_immutable;

import java.util.Arrays;
import java.util.Random;

public class C02_PassByValue {
    public static void main(String[] args) {
        /*
        birden fazla element içeren array ve arraylist gibi yapılarda  da passBye value gecerlidir

        eğer methotda array veya listin kendisi değiştirilirse passbye value ozelliği
        sebebiyle değişend eğeri değil array ve listin orjinal değerinş alır

        ancak array ve list değiştirilmeden sadece içindeki elemnalar değiştirilrse
        java obje değişmediği için(referans aynı)
       aynı array veya list dondurur ancal içindeki elementler değişmiş olacaktır
         */

        /*
        verilen 4 elemanli bir array i
        method a gonderelim method da
        yeni 3 elemanli bir array atayip
        bu yeni array e rastgele 100 den kucuk
        3 sayi atayalim
        method da array i yazdiralim

        main method da da method call dan sonra yenide method u yazdiralim

         */

        int[]arr={3,4,8,10};
        arrayiDegistir(arr);
        System.out.println("methot call dan sonra main methotda array: "+Arrays.toString(arr));
    }

    private static void arrayiDegistir(int[] arr) {
        Random rnd=new Random();
        arr=new int[3];
        arr[0]=rnd.nextInt(100);
        arr[1]=rnd.nextInt(100);
        arr[2]=rnd.nextInt(100);
        System.out.println("methotda array: "+Arrays.toString(arr));
    }
}
