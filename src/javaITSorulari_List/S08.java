package javaITSorulari_List;

import java.util.ArrayList;
import java.util.List;

public class S08 {
    public static void main(String[] args) {
        //Listedeki 7 ve 10 dışındaki her öğenin değerini 2'şer artırın
        //Örnek: (12, 31, 7, 13, 10) ==> Çıktı (14, 33, 7, 15, 10)

        List<Integer>listeler=new ArrayList<>();
        listeler.add(3);
        listeler.add(5);
        listeler.add(7);
        listeler.add(10);
        listeler.add(33);
        listeler.add(10);
        listeler.add(8);
        for (int i = 0; i <listeler.size() ; i++) {
            if (!(listeler.get(i)==7||listeler.get(i)==10)){
           listeler.set(i, listeler.get(i)+2);}
        }
        System.out.println("listeler = " + listeler);

        for (int w:listeler
             ) {
            if (w==7||w==10){
                continue;
            }else {
                listeler.set(listeler.indexOf(w),w+2);
            }
        }
        System.out.println("listeler 2.hali = " + listeler);
    }
}
