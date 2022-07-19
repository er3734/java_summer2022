package alistirmaSayfam02;

public class A27_Boom2 {
    public static void main(String[] args) {
        // sayılardan oluşan bir diziyi parametre olarak alan  ve dizide 7 rakamı  var ise  "Boom!"
        // ifadesini; aksi takdirde  "dizide 7 rakamı yok" ifadesini döndüren bir method oluşturun".
        /*Örnek çıktı:
                [1, 2, 3, 4, 5, 6, 7])➞ "Boom!"
                [] ➞ "dizide 7 rakamı yok"
                [2, 55, 60, 97, 86] ➞ "Boom!"     */

        int[]dizi={1,2, 3, 4, 5, 6};

        boomDizi(dizi);
    }

    private static void boomDizi(int[] dizi) {
        int sayac=0;
        for (int w:dizi
             ) {
            int bb=0;
            while (w!=0){
                bb=w%10;
                w/=10;
                if (bb==7){
                  sayac++  ;
                }
            }
        }
        if (sayac!=0){
        System.out.println("Boom!");
        }else {
            System.out.println("dizide 7 yok");
        }
    }
}
