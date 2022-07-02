package day22_MultiDimensionalArray;

import java.util.ArrayList;
import java.util.List;

public class C08_addAll {
    public static void main(String[] args) {
        List<Integer>sayilar1=new ArrayList<>();
        sayilar1.add(5);
        sayilar1.add(3);
        sayilar1.add(2);

        List<Integer>sayialr2=new ArrayList<>();
        sayialr2.add(10);
        sayialr2.add(15);
        sayialr2.add(16);
        sayialr2.add(20);

        sayilar1.addAll(sayialr2);
        System.out.println(sayilar1);//[5, 3, 2, 10, 15, 16, 20]

        sayilar1.addAll(1,sayialr2);
        System.out.println(sayilar1);//[5, 10, 15, 16, 20, 3, 2, 10, 15, 16, 20]
        /*
        bir listenin sonuna veya istediğimiz indexine başka bir collection ekleyebiliriz
         */



    }

}
