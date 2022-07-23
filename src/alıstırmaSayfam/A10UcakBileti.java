package alıstırmaSayfam;

import java.util.Scanner;

public class A10UcakBileti {

    //1 km 20 tl
    //0-12 yas %50 65 yas ustu %25 indirim
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("gideceğiniz km yi giriniz");
        int km = scan.nextInt();
        System.out.println("lutfen yaşınızı giriniz");
        int yas= scan.nextInt();

        double fyt=km*20;
        if(yas<=12){
             fyt = fyt*0.5;
            //System.out.println("ödemeniz gereken tutar : " + fyt);
        }else if(yas>=65){
            fyt= fyt*0.75;
            //System.out.println("ödemeniz gereken tutar : " + fyt);
        }else
            fyt=fyt;
        System.out.println("ödemeniz gereken tutar : " + fyt);
    }
}
