package day21_Arrays;

public class C01_2_MinimumSayi {
    public static void main(String[] args) {

        int sayilar[]={39,61,67,89,45,32,55};

        minimumSayi(sayilar);
    }

    private static void minimumSayi(int[] sayilar) {
        int minSayi=sayilar[0];

        for (int i = 1; i <sayilar.length ; i++) {
            if (sayilar[i]<minSayi){
                minSayi=sayilar[i];
            }
        }
        System.out.println("en küçük sayi : "+minSayi);
    }
}
