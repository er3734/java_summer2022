package r01_recap;

import java.util.Scanner;

public class Q07_BMISiniflama {

		/*
		 *  Kullanicidan boyunu  CM  ve kilosunu kg alarak  BMI (VKE) hesaplayiniz
		 *
		BMI = kilo(kg) /(boy*boy)(m)
		BMI <=20 oldukca zayifsiniz
		20<BMI<=25 Normal sinirlardasiniz
		25<BMI<=30 Sisman kategorisindesiniz
		30<BMI ==> Obez grubundasiniz.

		 */
        public static void main(String[] args) {
            Scanner scan=new Scanner(System.in);
            System.out.println("boyunuzu cm cinsinden giriniz");
            double boy= scan.nextDouble()/100;
            System.out.println("kilonuzu kg cinsinden giriniz");
            double kilo= scan.nextDouble();

            double bmi=kilo/(boy*boy);
            System.out.println("bmi = " + bmi);

            if (bmi<=20){
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