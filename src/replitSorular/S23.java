package replitSorular;

import java.util.Scanner;

public class S23 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("lutfen bir isim giriniz");
        String ad= scan.nextLine();

        if (ad.length()==3){
            if (ad.charAt(0)==ad.charAt(1)||ad.charAt(0)==ad.charAt(2)
            ||ad.charAt(1)==ad.charAt(2)){
                System.out.println("isim aynı karekterlere sahiptir");
            }else {
                System.out.println("dizenin benzersiz karekterleri var");
            }
        }else {
            System.out.println(" 3 harfli bir isim giriniz");
        }
    }
}
