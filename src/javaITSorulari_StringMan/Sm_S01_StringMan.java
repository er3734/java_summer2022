package javaITSorulari_StringMan;

public class Sm_S01_StringMan {
    public static void main(String[] args) {
        //Sadece tek bir kelimeden oluşan şehir isimleri
        // için bir String değişkeni oluşturun.
        // Şehir adını, baş harfi büyük ve diğer tüm karakterlerle yazdırın

        String sehir="istHSDbul";
        String ysehir=sehir.trim();

        ysehir=ysehir.substring(0,1).toUpperCase()+ysehir.substring(1).toLowerCase();
        System.out.println(ysehir);

    }
}
