package day03_scanner;

public class C01_AsciiTable {
    public static void main(String[] args) {
        int sayi=10;
        char harf='a';
        String str="banan";


        System.out.println(sayi+harf);
        System.out.println(str+harf);
        System.out.println(""+sayi+harf);

        //char yeniHarf= harf+2; jav önce sağdaki işlemi yapar sağda int+char görünce ascıı değerini alır
        //sonucu 99 bulur.sonra atama işlemi yapmaya çalısır
        // char yeniHarf =99;

    }
}
