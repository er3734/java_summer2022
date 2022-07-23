package alıstırmaSayfam;

import java.util.Scanner;

public class A18KullanıcıGirisi {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("kullanıcı adını giriniz");
        String ka= scan.nextLine();
        System.out.println("parolanızı giriniz");
        String sif= scan.next();

        if(ka.equals("erdi")&&sif.equals("3734")){
            System.out.println("bilgiler doğru");
        }else
            System.out.println("yanlış girdiniz");
    }
}
