package day03_scanner;

public class C02_Swap {

    public static void main(String[] args) {
        /*
        1-verilen sayi1 ve sayi2 ver. larının değerlerini değiştiren
        (SWAP) bir prog. yazınız
         */
        int sayi1=15;
        int sayi2=20;
        System.out.println("ilksayi1 : " + sayi1 + " ilksayi2 : " + sayi2);
        int temp =0;

        temp=sayi2;
        sayi2=sayi1;
        sayi1=temp;

        System.out.println("saonsayı1 : " + sayi1 + " sonsayı2 : " + sayi2);

    }
}
