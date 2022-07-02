package day21_Arrays;

public class C02_Arrays_EnUzunveKısaKelime {
    public static void main(String[] args) {
       /* Soru 2- Verilen String bir array’de en uzun ve en kisa String’leri
        yazdiran bir method olusturun*/
        String [] isimler={"Erdal","Onur","Mehmet","Hayrullah","Mihrican","Can"};

        enUzunVeKisayiYazdir(isimler);

    }
    public static void enUzunVeKisayiYazdir(String[] isimler) {
        String enUzun=isimler[0];
        String enKisa=isimler[0];
        for (int i = 1; i <isimler.length ; i++) {
            if (enUzun.length() < isimler[i].length()) {
                enUzun = isimler[i];
            }
            if (isimler[i].length() < enKisa.length()) {
                enKisa = isimler[i];
            }
        }
        System.out.println("arraydeki en uzun kelime : "+enUzun);
        System.out.println("arraydeki en kısa kelime : "+enKisa);
    }
}
