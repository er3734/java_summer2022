package day23_list;

import java.util.ArrayList;
import java.util.List;

public class C01_List {
    public static void main(String[] args) {

        List<Integer> sayilar1 = new ArrayList<>();
        sayilar1.add(5);
        sayilar1.add(3);
        sayilar1.add(2);

        System.out.println("listenin boyutu : "+  sayilar1.size());//3
        sayilar1.add(2);
        sayilar1.addAll(sayilar1);
        System.out.println("listenin yeni boyutu : "+  sayilar1.size());//8

        sayilar1.set(2,8);
        System.out.println(sayilar1);//[5, 3, 8, 2, 5, 3, 2, 2]

        System.out.println(sayilar1.set(0,12));//sildiği elemnı getirir 5
        int a=sayilar1.set(1,4);
        System.out.println(a);//3 silidk yeni bir değişkene atadık
        System.out.println(sayilar1);//[12, 3, 8, 2, 5, 3, 2, 2]


    }
}
