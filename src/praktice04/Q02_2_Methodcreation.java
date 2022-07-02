package praktice04;

import java.util.Scanner;

public class Q02_2_Methodcreation {
    public static void main(String[] args) {
        /*
      cm olarak verilen bir sayiyi, metre ve kilometreye donusturen bir method yaziniz
       */

        Scanner scan=new Scanner(System.in);
        System.out.println("m ve km ye dönüştürmek istediğiniz cm değerini giriniz");
        double santiMetreValue=scan.nextDouble();

        convertCM(santiMetreValue);
    }

    private static void convertCM(double santiMetreValue) {
        double meter=santiMetreValue/100;
        double kMeter=santiMetreValue/100000;
        System.out.println("giridiğiniz : "+santiMetreValue+" cm değeri "+ meter+" metredir, "+kMeter+" km dir" );

    }
}
