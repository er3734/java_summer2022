package replitSorular;

import java.util.Scanner;

public class S26ForWhile1 {
    /*
    Kullanıcıdan bir isim ve bir karakter girmesini isteyin,
    ardından döngüleri kullanarak karakterin isimde
    kaç kez tekrarlandığını kontrol edin.
     */

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("bir isim giriniz");
        String isim=scan.nextLine();
        System.out.println("lutfen bir karekter giriniz");
        char kar=scan.next().charAt(0);
        int a=0;
        //System.out.println(isim.substring(isim.length()-1));
        //if (isim.substring(isim.length()-1).equals(kar)){
           // System.out.println("ok");

        for (int i = isim.length()-1; i >=0 ; i--) {
            if (isim.charAt(i)==kar){
                a+=1;
            }
        }
        System.out.println(isim +" "+ a + " defa " + kar +" karektrini içeriyor");
    }
}
