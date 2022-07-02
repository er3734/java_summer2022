package day20_Arrays;

import java.util.Arrays;

public class C04_ElemanlariYazdirma {
    public static void main(String[] args) {

        int sayilar[]={1,2,3,4,5,6,7};
        //arrayin tamamını yazdıralım
        System.out.println(Arrays.toString(sayilar));//[1, 2, 3, 4, 5, 6, 7]

        //arrayin tüm elemntlerini yazdırın
        for (int i = 0; i <sayilar.length ; i++) {
            if (i< sayilar.length-1) {
                System.out.print(sayilar[i] + " ,");//1 2 3 4 5 6 7
            }else
                System.out.println(sayilar[i]);
        }
    }
}
