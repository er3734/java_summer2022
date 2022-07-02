package day20_Arrays;

public class C01_LocalVariables {
    public static void main(String[] args) {
        int sayi=10;
        //System.out.println(sayiMethod);sayiMethod method 1d eoluşturlmuş
        //local var.dır

        for (int i = 0; i <20 ; i++) {
            System.out.println(i);
        }
       // System.out.println(i); i loopta oluşturlmulş local var dır
        //sadece loop içerisnde kulanalabilir

       // static int sayiStatic=20;//static keyword sadece class lecel da kullanılabilir
        //methodaların içerisnde srtatic var tanımlanamaz

    }
    public static void method1(){
        //System.out.println(sayi);sayi main methodda oluştıulmuş local  bir vardır
        //sadece main methodda gecerlidir

        int sayiMethod=20;

    }
}
