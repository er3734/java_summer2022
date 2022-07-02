package day09_tenaryOperator;

import java.util.Scanner;

public class C02_Ternary {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int a= scan.nextInt();

        //eğer ternary içindeki sonuçlar farklı  data türlerinde ise sadece yazdırma yapabiliriz
        System.out.println((a<0)?(a*a):"pozitif");
    }
}
