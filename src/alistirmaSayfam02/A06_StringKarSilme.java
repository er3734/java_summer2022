package alistirmaSayfam02;

public class A06_StringKarSilme {
    // Bir string içinden girdiğimiz
    // karakteri silen bir java Method yazın
    // String="kkmekrkkhabkak"" olsun.
    // Silinecek karakter 'k' olsun. geri dönecek değer ==> "merhaba"

    public static void main(String[] args) {
        String str="kkmekrkkhabkak";
        String sil="k";
        karekterDeğistir(str,sil);
    }
    public static void karekterDeğistir(String str ,String sil){

        String ystr="";

        if (str.contains(sil)){
            ystr=str.replaceAll(sil,"merhaba");
        }
        System.out.println(ystr);
    }
}
