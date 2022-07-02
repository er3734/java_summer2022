package day24_rrayList_ForEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C05_S04_IstenmeyenleriSİl {
    public static void main(String[] args) {
        // Soru 4) Verilen bir array'de istenmeyen harf iceren kelimeleri silip,
// kalan elementleri yeni bir array yapin

        String[]sehirler={"istanbul","ankara","mersin","konya","kastamonu"};
        String istenmyenHarf="a";
        List<String>kalanlar=new ArrayList<>();

        for (int i = 0; i < sehirler.length ; i++) {
            if(!sehirler[i].contains(istenmyenHarf)){
                kalanlar.add(sehirler[i]);
            }
        }
        //lop bitiğinde istenmeyen har içermeyen şehirler listeye eklenmiş placak
        System.out.println(kalanlar);
        //yeni bir array oluşturup listeyi ona aktaralım
        String []kalanlarArrayi=new String[kalanlar.size()];
        for (int i = 0; i < kalanlarArrayi.length ; i++) {
            kalanlarArrayi[i]=kalanlar.get(i);
        }
        sehirler=kalanlarArrayi;
        System.out.println("sehirler arrayinin son hali: "+ Arrays.toString(sehirler));
    }
}
