package arrayler;

import java.util.ArrayList;
import java.util.List;

public class A11_List {
    public static void main(String[] args) {
        List<Integer>sayilar1=new ArrayList<>();
        List<Integer>sayilar2=new ArrayList<>();
        sayilar1.add(12);
        sayilar1.add(3);
        sayilar1.add(4);
        sayilar1.add(14);
        sayilar1.add(31);

        sayilar2.add(5);
        sayilar2.add(50);
        sayilar2.add(15);
        sayilar2.add(23);
        sayilar2.add(2);

        System.out.println(sayilar1.equals(sayilar2));
        sayilar1.addAll(sayilar2);
        System.out.println(sayilar1);
        System.out.println(sayilar2);
        sayilar2.addAll(2,sayilar2);
        System.out.println(sayilar2);
        sayilar1.set(3,25);
        sayilar1.containsAll(sayilar1);
        System.out.println(sayilar1.containsAll(sayilar1));
        System.out.println(sayilar1.size());
        sayilar1.removeAll(sayilar2);
        System.out.println(sayilar1);
        sayilar1.lastIndexOf(3);
        System.out.println(sayilar1.lastIndexOf(31));
        sayilar1.add(1,31);
        System.out.println(sayilar1.lastIndexOf(31));
        sayilar1.subList(1,3);
        System.out.println(sayilar1.subList(1,3));
    }
}
