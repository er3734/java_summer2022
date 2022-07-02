package day21_Arrays;

import java.util.Scanner;

public class C03_Contains{
    public static void main(String[] args) {
       /* Soru 3- Verilen bir array’in istenen bir elemani icerip icermedigini
        kontrol edip, bize true veya false sonucu donen bir method olusturun.*/
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen aradğınız ismi yazınız");
        String [] isimler={"Başak","Nurullah","Adem","Fatih","Enes"};
        String arananIsim=scan.nextLine();

        boolean sonuc=contains1(isimler,arananIsim);
        System.out.println(sonuc);

        if(sonuc){
            System.out.println("girilen isim listede var");
        }else {
            System.out.println("girilen isim listede yok");
        }
    }
    public static boolean contains1(String[] isimler, String arananIsim) {
        boolean sonucMethod=false;
        for (int i = 0; i < isimler.length ; i++) {

            if (isimler[i].equalsIgnoreCase(arananIsim)) {
                sonucMethod=true;
            }
        }
        return sonucMethod;
    }
}
