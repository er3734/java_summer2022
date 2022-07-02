package day15_verloading_forLoop;

public class C05_ForLoop {
    public static void main(String[] args) {
       // 1den 5 e kadar tam sy. topla
        int toplam=0;

        for (int i = 1; i <=5 ; i++) {
          toplam+=i;  
        }
        System.out.println("toplam = " + toplam);
        // 10 ile 20 arasındaki sayıları topla
        toplam=0;
        for (int i = 10; i <=20 ; i++) {
            toplam+=i;
        }
        System.out.println("toplam = " + toplam);

        //30 dahil 50 dahil aradaki çift say. top
        toplam=0;
        for (int i = 30; i <=50 ; i+=2) {
            toplam+=i;
        }
        System.out.println("toplam = " + toplam);

        toplam=0;
        for (int i = 30; i <=50 ; i++) {
            if (i%2==0){
                toplam+=i;
            }
        }
        System.out.println("30-50 2. toplam = " + toplam);
        //1500 ile 1600 arasında 7 ile bol. top
        toplam=0;
        for (int i = 1500; i <=1600 ; i++) {
            if (i%7==0){
                toplam+=i;
            }
        }
        System.out.println("7 ile bol toplam = " + toplam);
    }
}
