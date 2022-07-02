package praktice_06;

import java.util.Scanner;

public class Q10_Interview {
    /*
     * Kulanicidan alinan bir Stringin ilk ve son harfini yine kulanicidan alinan sayi kadar
     * return eden metod yaziniz
     *
     * ornek:  input            output
     *         elma  2           eaea
     *         army  3           ayayay

     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("bir string ifade giriniz");
        String str=scan.nextLine();
        System.out.println("tekrar sayısını girinz");
        int tekrar=scan.nextInt();
        String output=tekrarHarfler(str,tekrar);
        System.out.println(output);
    }

    private static String tekrarHarfler(String str, int tekrar) {
        String out="";
        for (int i = 0; i <tekrar ; i++) {
            out+=str.substring(0,1).concat(str.substring(str.length()-1));
        }
        return out;
    }
}
