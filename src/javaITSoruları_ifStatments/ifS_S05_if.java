package javaITSoruları_ifStatments;

public class ifS_S05_if {
    public static void main(String[] args) {
        /*Bir üçgenin iki kenarının
        uzunluğu eşitse, a) "İkizkenar Üçgen" yazdırılacak kodu yazın. b) Bir
        üçgenin tüm kenarlarının uzunluğu eşitse "Eşkenar Üçgen". c) a ve b
        koşulları sağlanmıyorsa "ne ikizkenar ne eşkenar"*/

        int a=3;
        int b=4;
        int c=3;
        if (a==b&&b!=c||a==c&&a!=b||b==c&&a!=c){
            System.out.println("ikizkenar üçgen");
        } else if (a==b&&b==c) {
            System.out.println("eşkenar üçgen");
        }else System.out.println
                ("ne ikiz kenar ne de eskenar üçgen");

        System.out.println(a==b&&b==c?"eşkenar üçgen":a==b&&b!=c||a==c&&a!=b||b==c&&a!=c?
                           "ikizkenar üçgen":"ne ikiz kenar ne de eskenar üçgen");
    }
}
