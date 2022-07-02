package javaITSorulari_Nested;

public class Nesif_S05_Nested {
    public static void main(String[] args) {


        /*Bir yılın artık yıl olup olmadığını kontrol eden bir program yazın.
                İç içe üçlü kullanarak görevi çözün
        8'den fazla karakter içeriyorsa, baş harfi 'i' olmalıdır

        8'den fazla karakter içermiyorsa, baş harfi 'K' olmalıdır*/

        String sifre="isgdhsdefefefe";
        String kontrol=sifre.length()>8?sifre.startsWith("i")?"gecerli":"gecersiz":
                sifre.startsWith("K")?"gecerli":"gecersiz";
        System.out.println(kontrol);

    }
}
