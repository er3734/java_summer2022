package javaITSorulari_StringMan;

public class Sm_05_StringMan {
    public static void main(String[] args) {
        // Bir String değişkeni oluşturun ve herhangi bir şey için konsoldaki
        // yalnızca boşluk olmayan son karakteri yazdırın.

        String str="Ali CaN";
        System.out.println(str.trim().substring(str.length()-1));
       //6  Bir String değişkeni oluşturun ve String'in ilk ve son
        // karakterlerinin ASCII değerlerinin toplamını bulun.
        int as=str.charAt(0);
        System.out.println(as);
        int sas=str.charAt(str.length()-1);
        System.out.println(sas);
        System.out.println(as+sas);
        //S7 Bir String değişkeni oluşturun ve konsoldaki
        //ilk karakter dışındaki tüm karakterleri yazdırın
        System.out.println(str.substring(1).toLowerCase());
        //S8String değişkeni oluşturun ve konsoldaki son karakter dışındaki
        //tüm karakterleri şurada yazdırın:
        System.out.println(str.substring(0,str.length()-1));

        //S9Bir String değişkeni oluşturun ve konsoldaki ilk karakter ve
        //son karakter dışındaki tüm karakterleri büyük harflerle yazdırın
        System.out.println(str.substring(0,1).toLowerCase()+
                str.substring(1,str.length()-1).toUpperCase()+
                str.substring(str.length()-1).toLowerCase());

    }
}
