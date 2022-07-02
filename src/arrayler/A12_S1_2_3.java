package arrayler;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class A12_S1_2_3 {
    public static void main(String[] args) {
        List<String> harfler=new ArrayList<>();
        harfler.add("A");
        harfler.add("C");
        harfler.add("E");
        harfler.add("F");
        System.out.println(harfler);
        harfler.add("B");
        harfler.add(1,"L");
        System.out.println(harfler);
        harfler.indexOf("E");
        harfler.set(harfler.indexOf("E"),"D");
        System.out.println(harfler);
        harfler.remove("F");
        System.out.println(harfler);
        Collections.sort(harfler);
        System.out.println(harfler);
        System.out.println(harfler.contains("L"));
        System.out.println(harfler.contains("M"));
        System.out.println(harfler.size());
        harfler.clear();
        System.out.println(harfler.isEmpty());
    }
}
