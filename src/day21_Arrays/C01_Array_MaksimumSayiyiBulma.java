package day21_Arrays;

public class C01_Array_MaksimumSayiyiBulma {
    public static void main(String[] args) {
       // Soru 1- Verilen bir int array’deki en buyuk sayiyi yazdiran bir method olusturun.



        maxSayiYazdir();
    }
    public static void maxSayiYazdir() {
        int [] sayilar={3,5,7,1,4,9,5,2};

        int maxSayi=sayilar[0];
        for (int i = 1; i <sayilar.length ; i++) {
            if (maxSayi<sayilar[i]){
                maxSayi=sayilar[i];
            }
        }
        System.out.println("arraydaki en büyük sayi : "+maxSayi);
    }
}
