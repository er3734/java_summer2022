package day24_rrayList_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C06_ForeachLoop {
    public static void main(String[] args) {
        int arr[]={2,3,5,7,66,54,31,12};
        List<Integer>liste=new ArrayList<>();
        
        //arraydeki tüm elemanları inceleyelim tek sayı olanları liste atayalım

        for (int each :arr //gelecek datalarım turu loop içinde ne isim verdiğim ve nereden aldığım
             ) {
            if (each%2==1){
                liste.add(each);
            }
        }
        System.out.println(liste);
    }
}
