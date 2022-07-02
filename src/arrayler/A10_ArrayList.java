package arrayler;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class A10_ArrayList {
    public static void main(String[] args) {

        List<String>list=new ArrayList<>();
        list.add("kedi");
        list.add("ayı");
        list.add(2,"sinek");
        list.add(0,"panda");
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        list.remove("kedi");
        list.remove(2);
        list.add("at");
        list.add(3,"inek");
        System.out.println(list);
        list.add(1,"inek");
        list.remove("inek");
        System.out.println(list);
        System.out.println(list.remove("kedi"));
        System.out.println(list.remove("inek"));
        list.set(1,"boğa");
        System.out.println(list);
        System.out.println(list.get(0));
        System.out.println(list.contains("panda"));
        list.add("eşek");
        list.add("kartal");
        list.add("aslan");
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        list.clear();
        System.out.println(list);
    }
}
