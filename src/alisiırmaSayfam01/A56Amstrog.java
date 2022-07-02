package alisiırmaSayfam01;

public class A56Amstrog {
    public static void main(String[] args) {

        for (int i = 100; i <= 999; i++) {
            int sayi = i;
            int bb = sayi % 10;
            sayi /= 10;
            int ob = sayi % 10;
            sayi /= 10;
            int yb = sayi % 10;

            if ((bb * bb * bb) + (ob * ob * ob) + (yb * yb * yb) == i) {
                System.out.println(i + " amstrog");
            }
        }
    }
}

