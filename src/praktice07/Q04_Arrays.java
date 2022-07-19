package praktice07;

import java.util.ArrayList;
import java.util.List;

public class Q04_Arrays {

    /*
     *  Verilen bir cumledeki bosluklar haric character sayisini bulunuz.
     *  Cumle: Verilen bir cumledeki bosluklar haric character sayisini bulunuz.
     */
    public static void main(String[] args) {
        List<String>liste= new ArrayList<>();
        String cumle="Verilen bir cumledeki bosluklar haric character sayisini bulunuz.";
        liste= List.of(cumle.split(" "));
        System.out.println("liste = " + liste);
        int karTop=0;
        for (String w:liste
             ) {
            karTop+=w.length();

        }
        System.out.println("karTop = " + karTop);
    }

}
