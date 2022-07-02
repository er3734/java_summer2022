package praktice02;

import java.util.Scanner;

public class Q07_StringManipulation {

    // Kullanicidan 4 harfli bir kelime isteyin
    // ve girilen kelimeyi tersten yazdiri
    public static void main(String[] args) {
       cevirme();
       cevirme();
    }
    public static void cevirme(){
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen; 4 harfli bir kelime giriniz ");
        String kel=scan.nextLine();
        String tersKel=kel.substring(3)+kel.substring(2,3)
                       +kel.substring(1,2)+kel.substring(0,1);

        System.out.println("tersKel = " + tersKel);
    }


}