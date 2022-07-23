package praktice02;

import java.util.Scanner;

public class Q01_StringManipulaton {

    /*
     * Kullanicidan 4 kelime isteyin ve cumle olarak yazdirip sonuna . koyun
     *
     * Ornek : Inputs : cesaret, insana, sinirlarini, ogretir
     *         Output : Cesaret insana sinirlarini ogretir.
     *
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
<<<<<<< HEAD
        System.out.println("lutfen 4 kelime girniz");
        String kel1=scan.next();
       // System.out.println("lutfen 2. kelimeyi giriniz");
        String kel2=scan.next();
        //System.out.println("lutfen 3.keklimeyi giriniz");
        String kel3=scan.next();
       // System.out.println("lutfen 4.kelimeyi girinzi");
        String kel4=scan.next();
=======
        System.out.println("lutfen 1. kelime girniz");
        String kel1=scan.nextLine();
        System.out.println("lutfen 2. kelimeyi giriniz");
        String kel2=scan.nextLine();
        System.out.println("lutfen 3.keklimeyi giriniz");
        String kel3=scan.nextLine();
        System.out.println("lutfen 4.kelimeyi girinzi");
        String kel4=scan.nextLine();
>>>>>>> 7e6f873aecd00867db15615b9dbce48ba4389557
        
        String output=kel1.substring(0,1).toUpperCase().concat(kel1.substring(1)).
                concat(" ").concat(kel2).concat(" ").concat(kel3).concat(" ").
                concat(kel4).concat(".");
        System.out.println("output = " + output);
        
        
    }
}