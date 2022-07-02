package javaITSorulari_Arrays;

public class S06 {
    public static void main(String[] args) {
        //Belirli bir String'de 'a' veya 'A' ile başlayan kaç kelimeyi sayın
        String s = "Apex, nesne ayönelimli abir programlama dilidir";
        String[]dizi=s.split(" ");
        int sayac=0;
        for (int i = 0; i < dizi.length ; i++) {
            if (dizi[i].startsWith("a")||dizi[i].startsWith("A")){
                sayac++;
                
            }
        }
        System.out.println("sayac = " + sayac);

    }
}
