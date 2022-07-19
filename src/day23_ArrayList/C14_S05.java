package day23_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C14_S05 {
    public static void main(String[] args) {

        List<Integer>fibonacci=new ArrayList<>();
        int n1=0;
        int n2=1;
        int n3=0;
        fibonacci.add(0);
        fibonacci.add(1);
        int sayi=10;
       while (n3<sayi){
           n3=n1+n2;
           if (n3<sayi){
               fibonacci.add(n3);
            n1=n2;
            n2=n3;}
       }
       System.out.println(fibonacci);

    }
}
