package praktice_06;

import java.util.Scanner;

public class Q11_Odev {

    // STRING OLAN PIN kodunuzu kontrol eden bir kod yazınız.

    public static void main(String[] args) {
        String pin="mehmet.1234";
        int girisHakkı=3;

        Scanner scan=new Scanner(System.in);
        System.out.println("***Hoş Geldiniz***");

        while (true){
            System.out.println("Pin kodunuzu giriniz");
            String girilenPin=scan.nextLine();
            if(pin.equals(girilenPin)){
                System.out.println("başarılı giriş yaptınız");
                break;
            }else {
                System.out.println("yanlış giriş yaptınız");
                girisHakkı--;
                System.out.println("kalan giriş hakkınız: "+girisHakkı);
            }
            if (girisHakkı==0){
                System.out.println("giriş hakkınız kalmadı hattınız bloke oldu");
                break;
            }
        }
    }
}
