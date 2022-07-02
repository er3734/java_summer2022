package day21_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C04_2_ArrayKulanici {
    public static void main(String[] args) {
        //Soru 4- Kullanicidan bir array’in boyutunu ve tum elementlerini alarak bir array
        //olusturup,bu array’i bize donduren bir method olusturun

        String  takimlar[]=yeniArray();
        System.out.println(Arrays.toString(takimlar));
    }

    private static String[] yeniArray() {
        Scanner scan=new Scanner(System.in);
        System.out.println("dizinin eleman sayısını giriniz");
        int boyut=scan.nextInt();
        String takim[]=new String[boyut];
        for (int i = 0; i <boyut ; i++) {
            System.out.println(i+ ". takimi giriniz");
            takim[i]=scan.next();
        }
        return takim;
    }
}
