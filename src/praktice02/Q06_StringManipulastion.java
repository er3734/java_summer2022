package praktice02;

import java.util.Scanner;

public class Q06_StringManipulastion {

    // Kullanicidan alacaginiz bir stringde bosluk karakterinin olup olmadigini kontrol ediniz.
    // Kullanicidan alacaginiz bir stringin bos olup olmadigini kontrol ediniz.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir string ifade giriniz");
        String str = scan.nextLine();
        System.out.println("lutfen 2. bir string ifade giriniz");
        String str2 = scan.nextLine();

        if (str.contains(" ")) {
            System.out.println("girdiğiniz string boşluk içeriyor");
        } else
            System.out.println("girdiğiniz string boşluk içermiyor");

        if (str2.length() == 0) {
            System.out.println("girdiğiniz string boş");

        }else System.out.println("str2 = " + str2);

      /*  int bosluk = str.indexOf(' ');
        if (bosluk == -1 && !(str.isEmpty())) {
            System.out.println("bosluk yoktur");
        } else {
            System.out.println("bosluk vardir");}*/

    }
}
