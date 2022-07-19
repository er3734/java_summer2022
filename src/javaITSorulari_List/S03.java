package javaITSorulari_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class S03 {
    public static void main(String[] args) {
        // Bir tamsayı listesindeki tüm çift liste öğelerinin çarpımını bulun

        List<Integer>liste=new ArrayList<>();
        liste.add(5);
        liste.add(41);
        liste.add(6);
        liste.add(23);
        liste.add(5);
        liste.add(27);
        liste.add(2);
        int carpim=1;
        for (int w:liste
             ) {
            if (w%2==0){
                carpim*=w;
            }
        }
        System.out.println("carpim = " + carpim);
    }
}
