package day24_ArrayList_ForEachLoop;

import java.util.Arrays;
import java.util.List;

public class C01_ArraydenArrayListYapmak {
    public static void main(String[] args) {

        String[]arr={"ismail","nurullah","fatih"};
        /*
        uzun listler olusturmamız gerektiğinde tek tek eklemek yeine
        array oluşturp bunları liste cevirmek daha pratik olabilir
       1-loop ile arraydeki tüm elementleri list eatabiliriz
       2-Arrays clasında Arrays.asList methodunu kullanabiliriz
       ancak bu methodun 2 tane kötü yan etkisi var
       -Arrays clası kullanıldığı için array öz. gecerli olur
       dolsıyla liste add, remove gibi size değiştireb methodlar bu şekilde
       oluşturulan listlerde kullanılamaz
       -kaynak olan arrayle ile urun olan list ozdeşliştirilir
       birinde yapılan eğişiklik otamatik olarak diğerine de işlenir
       */

        List<String>sinifList= Arrays.asList(arr);
        System.out.println(sinifList);//[ismail, nurullah, fatih]

       //1.yan etki
        //sinifList.add("erdi");UnsupportedOperationException
       // sinifList.remove(1);UnsupportedOperationException

        //2. yan etki
        arr[1]="emre";
        System.out.println("değişim sonrası array: "+Arrays.toString(arr));//[ismail, emre, fatih]
        System.out.println("Arrayi değiştirince list: "+sinifList);// [ismail, emre, fatih]

        sinifList.set(0,"utku");
        System.out.println("listi değiştirince list: "+sinifList);//[utku, emre, fatih]
        System.out.println("listi değiştirnce array: "+Arrays.toString(arr));//[utku, emre, fatih]


    }
}
