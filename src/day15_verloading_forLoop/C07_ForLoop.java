package day15_verloading_forLoop;

public class C07_ForLoop {
    public static void main(String[] args) {

        C06_ForLoop.terstenYazdir2("erdi");
        //100 den 1 e kadar  sınırlar dahil 8 ile böl. sayılarınyazdır

        for (int i = 100; i >=1 ; i--) {
            if (i%8==0){
                System.out.print(" " + i);
            }

        }
    }
}
