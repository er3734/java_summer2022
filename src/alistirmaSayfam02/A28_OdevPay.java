package alistirmaSayfam02;

import java.util.Arrays;

public class A28_OdevPay {
    /*
     Merhaba arkadaşlar; aşağıdaki örnekte olduğu gibi 1 den 10 a kadar
     sayılar oluşan dizide eksik olan sayıyı döndüren metodu oluşturunuz.
      Not: Çözümlerde tüm Class'ı paylaşırmısınız
     ([1, 2, 3, 5, 6, 7, 8, 10,9]) ➞ 4
     ([7, 2, 3, 10, 5, 9, 1, 4, 8]) ➞ 6
     ([7, 5, 1, 2, 4, 6, 8, 3, 9]) ➞ 10
     */
    public static void main(String[] args) {
        int[]arr={7, 5, 1, 2, 4, 6, 8, 3, 9};
        Arrays.sort(arr);
        for (int i = 0; i <9 ; i++) {
            if(arr[i]!=i+1){
                System.out.println(i+1);
                break;
            }
        }
    }
}
