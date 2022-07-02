package arrayler;

import java.util.ArrayList;

public class A07ArrayList {

    public static void main(String[] args) {
        ArrayList<String> groups= new ArrayList<String>();
        groups.add("met");
        groups.add("iron");
        groups.add("guns");
        groups.add("black");

        System.out.println(groups.indexOf("black"));

        groups.remove("iron");
        groups.remove(3);

        System.out.println("0. index: "+ groups.get(0));
        System.out.println("arlist uzunluk: "+ groups.size());

        for(int i=0;i<groups.size();i++) {
            System.out.println("eleman : "+ groups.get(i));
    }
}}
