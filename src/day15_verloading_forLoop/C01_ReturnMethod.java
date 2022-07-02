package day15_verloading_forLoop;

public class C01_ReturnMethod {
    public static void main(String[] args) {
        /*
        verilen iki sayıyı carpıp sonucu bize dödüren method
         */
        int sayi1=10;
        int sayi2=5;

        int sonuc=carpGetir(sayi1,sayi2);
        System.out.println(sonuc);
        System.out.println(carpGetir(7,3));

    }

    public static int carpGetir(int sayi1, int sayi2) {

        return sayi1*sayi2;
    }
}
