package arrayler;

import java.util.ArrayList;
import java.util.List;

public class A08ArrayList {
    public static void main(String[] args) {
        List<String> liste=new ArrayList<>();
        ArrayList<Integer>liste2=new ArrayList<Integer>();
        ArrayList<Double>liste3=new ArrayList<>();

        liste.add("erdi");
        liste2.add(5);
        liste3.add(7.4);
        System.out.println(liste);
        System.out.println(liste2);
        System.out.println(liste3);
        System.out.println(liste.size());
        System.out.println(liste2.size());
        System.out.println(liste3.size());
        System.out.println(liste.isEmpty());
        liste.remove("erdi");
        liste2.remove(0);
        System.out.println(liste);
        System.out.println(liste2);
        liste3.remove(0);
        System.out.println(liste3);

    }
}
