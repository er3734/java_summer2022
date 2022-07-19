package javaITSorulari_List;

import java.util.ArrayList;
import java.util.List;

public class S05 {
    //Listede eleman olarak 15 varsa, tüm 15'leri 51 olarak değiştirin
    public static void main(String[] args) {
        List<Integer>liste=new ArrayList<>();
        liste.add(15);
        liste.add(41);
        liste.add(32);
        liste.add(45);
        liste.add(24);
        liste.add(15);
        liste.add(89);
        for (int i = 0; i <liste.size() ; i++) {
            if (liste.get(i)==15){
                liste.set(i,51);
            }
        }
        System.out.println("liste = " + liste);
    }
}
