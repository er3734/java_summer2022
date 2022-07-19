package javaITSorulari_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class S02 {
    public static void main(String[] args) {
        //Bir tamsayı listesinde 13'ün ilk oluşumundan önceki tüm liste öğelerinin toplamını bulun

        List<Integer>liste=new ArrayList<>();
        liste.add(5);
        liste.add(8);
        liste.add(6);
        liste.add(2);
        liste.add(13);
        liste.add(51);
        liste.add(15);
        int top=0;
        int i=0;
       while (liste.get(i)!=13){
           if (liste.get(i)==13){
               break;
           }else {
               top+=liste.get(i);
           }
           i++;
       }
        System.out.println("top = " + top);
            top=0;
        for (int w:liste
             ) {
            if (w==13){
                break;
            }else {
                top+=w;
            }
        }
        System.out.println("top = " + top);
    }
}
