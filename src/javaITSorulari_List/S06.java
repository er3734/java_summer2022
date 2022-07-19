package javaITSorulari_List;

import java.util.ArrayList;
import java.util.List;

public class S06 {
    public static void main(String[] args) {
        // If a list has 15 or 13, remove them.
        //Example: (10, 31, 15, 13, 54) ==> Output is (10, 31, 54)

        List<Integer>liste=new ArrayList<>();
        liste.add(34);
        liste.add(31);
        liste.add(15);
        liste.add(45);
        liste.add(13);
        liste.add(345);
        liste.add(13);
        liste.add(45);
        liste.add(15);
        for (int i = 0; i <liste.size() ; i++) {
            if (liste.get(i)==15||liste.get(i)==13){
                liste.remove(i);
            }
        }
        System.out.println("liste = " + liste);
    }
}
