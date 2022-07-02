package replitSorular;

import java.util.Scanner;

public class S18 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("boyunuzu m cinsinden giriniz");
        double boy= scan.nextDouble();
        System.out.println("kilonuzu kg cinsinden giriniz");
        double kilo= scan.nextDouble();

        double bmi=kilo/(boy*boy);
        System.out.println("bmi = " + bmi);

        if (bmi<=18.5){
            System.out.println("oldukça zayıfsınız");
        } else if (bmi<=25) {
            System.out.println("normal sınırlardasınız");
        } else if (bmi<=30) {
            System.out.println("şişman kategorisnizdesiniz");
        } else if (bmi>30) {
            System.out.println("obez grubundansınız");
        }
    }
}
