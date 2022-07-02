package day23_list;

import java.util.ArrayList;
import java.util.List;

public class C15_S06 {
    public static void main(String[] args) {

        List<Integer> fibocci=new ArrayList<>();
        int n1=0;
        int n2=1;
        int n3=0;
        fibocci.add(0);
        fibocci.add(1);
        int sayi=10;
        for (int i = 2; i <sayi ; i++) {
            n3=n1+n2;
            fibocci.add(n3);
            n1=n2;
            n2=n3;
        }
        System.out.println(fibocci);

    }
}
