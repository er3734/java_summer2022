package day18_WhileLoop;

public class C03_DoWhileLoop {
    public static void main(String[] args) {
        /*
        while loop ta once kontrol edip sonra işlem yaptığımkız için
        işlem bittikten sonra loopun kırılması için 1 kez daha başa
        dönmmemiz gerekiyor
        bu durumda fazladan bir işlem yapılıyor
         */
        int sayi=7;

        while (sayi<10){
            System.out.println(sayi);
            sayi++;
        }
        /*
        dowhile loop la çalıştığımızda bu dezavantaj oratdan kalkar

                */
        sayi=7;
        do {
            System.out.println(sayi);
            sayi++;
        }while (sayi<10);
    }
}
