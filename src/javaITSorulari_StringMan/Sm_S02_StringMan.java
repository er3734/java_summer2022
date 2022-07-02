package javaITSorulari_StringMan;

public class Sm_S02_StringMan {
    public static void main(String[] args) {
        //kişi adları için 3 String değişken oluşturun.
        // Boşluk karakterleri hariç tüm 3 addaki karakter
        // sayısının toplamını yazdırın.

        String kisi1="erdi";
        String kisi2="hatice nur";
        String kisi3="irfan";
        String ykisi1=kisi1.trim();
        String ykisi2=kisi2.trim();
        String ykisi3=kisi3.trim();

        System.out.println(ykisi1.length()+ykisi2.length()+ykisi3.length());


    }
}
