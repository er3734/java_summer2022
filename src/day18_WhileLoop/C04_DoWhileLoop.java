package day18_WhileLoop;

import java.util.Scanner;

public class C04_DoWhileLoop {
    public static void main(String[] args) {
        /*
        kullanıcıdan tam sayılar alın kullanıcı çift sayı girdiği
        müddetçe sayıları yazdırın tek sayı girdiğinde işlemi bitirin
         */

        Scanner scan=new Scanner(System.in);
        int sayi=0;
        //while loop ile yapalım
        /*
        looplarda kullanacağımız var.ları looptan önce oluşturmalıyız
        while da lopptan once olusturduğumz bu ver.a atacağımız değeri
        iyi düşünmmemiz gerekiyor
         */

        while (sayi%2==0) {
            System.out.println("lutfen bir sayı giriniz");
            sayi = scan.nextInt();
            if (sayi%2==0){
            System.out.println("girilen sayı çift : "+sayi);
        }else {
                System.out.println("tek sayı girdinz");
            }
        }
        //do while ile
        //do while onceden olusturulan hangi değer atandığının hiç bir önemi yok
        // kodudmuz her durumda çalışır
        //do while dezavantajı ilk çalıştırma kontrol yapılmadan
        //olduğu için loopun badysinde yanlış bir işlem yapılmamasına dikkat etmek gerekir

        do {
            System.out.println("lutfen bir sayı giriniz");
            sayi = scan.nextInt();
            if (sayi%2==0){
                System.out.println("girilen sayı çift : "+sayi);
            }else {
                System.out.println("tek sayı girdinz");
            }
        }while (sayi%2==0);
    }
}
