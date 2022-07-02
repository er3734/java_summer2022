package r01_recap;

import java.util.Scanner;

public class Q09_NestedIF {

    /*
    Kullanici dan yas bilgisini alarak

	    oy kullanma yasi :
	 	age >= 18  ==> oy kullanmaya uygun
	 	age >= 70  ==> uc kez oy kullanabilir
	 	70 > age >=50 ==> iki kez oy kullanabilir
	 	50 > age >=18 ==> bir kez oy kullanabilir, yazdiriniz

	 */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("yaşınızı giriniz");
        int yas= scan.nextInt();

       if (yas>=18){
           System.out.println("oy kullanmaya uygun");
           if (yas>18&&yas<50){
               System.out.println("bir kez");
           } else if (yas>=50&&yas<70) {
               System.out.println("iki kere");
           } else if (yas>=70) {
               System.out.println("üç kere");
           }
       }else {
           System.out.println("oy lullanamzsın");
       }

    }

}