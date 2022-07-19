package day23_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C09_ArraydenListYapmak {
    public static void main(String[] args) {
        /*
        list ile çalışırken en kötü özelliği elemenları tek tek eklemek

         */

        Integer[]arr={2,3,6,5,7,1,3,5,0,5,8,0,1,2,4,8,9};
        /*
        bu kadar çok elemanlı listeyi tek tek eleman olarak girmek yerine
        artray oluşturup forlop ile oluşturduğumuz liste taşıyabiliriz
         */
        List<Integer>sayilar=new ArrayList<>();
        for (int i = 0; i <arr.length ; i++) {
            sayilar.add(arr[i] );
        }
        System.out.println(sayilar);//[2, 3, 6, 5, 7, 1, 3, 5, 0, 5, 8, 0, 1, 2, 4, 8, 9]
        /*
        bu ilemi yapması için javanın oluşturduğu bir methodda var
        ancak bu yontemin cok yan etkisi var

        1- bu şekilde oluştrulan listede add,remove gibi size değiştiren methodalra kullanılamaz
        2-asList Methodı ile oluşturulan liste ve kaynek olan array birbiri ile ilişik
        olarak hayatlarına devam edrler birinde yaptığımız deişiklik otamatik olarak
        diğerinede işler.

         */

        List<Integer>sayilar2= Arrays.asList(arr);
        System.out.println(sayilar2);//[2, 3, 6, 5, 7, 1, 3, 5, 0, 5, 8, 0, 1, 2, 4, 8, 9]

        sayilar.add(5);
        System.out.println(sayilar);//[2, 3, 6, 5, 7, 1, 3, 5, 0, 5, 8, 0, 1, 2, 4, 8, 9, 5]

       // sayilar2.add(5);
        // System.out.println(sayilar2);//RTE

        arr[0]=20;
        System.out.println(Arrays.toString(arr));//[20, 3, 6, 5, 7, 1, 3, 5, 0, 5, 8, 0, 1, 2, 4, 8, 9]
        System.out.println("arrayde değişiklik yapınca sayılar2 : " +sayilar2);
        //[20, 3, 6, 5, 7, 1, 3, 5, 0, 5, 8, 0, 1, 2, 4, 8, 9]

    }
}
