package day03_scanner;

public class C03_Swap2 {
    public static void main(String[] args) {
        /*bir önceki swap sorusunu boş kova kullanmadan yapın
         */

        int sayi1=15;
        int sayi2=20;
        System.out.println("swaptan önce : " + "sayi1 : " + sayi1 + " sayi2 : " + sayi2);
        sayi1=sayi1-sayi2;
        sayi2=sayi1+sayi2;
        sayi1=sayi2-sayi1;
        System.out.println("swaptan sonra : " + "sayi1 : " + sayi1 + " sayi2 : " + sayi2);
    }
}
