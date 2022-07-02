package replitSorular;

import java.util.Arrays;
import java.util.List;

public class S42_Array_7 {
    public static void main(String[] args) {
       /* Array i ARRAYLIST e çeviren Java Kodunu yazınız.

        Array : [ "Python", "JAVA", "PHP", "Perl", "C#", "C++" ]*/

        String[]arr={"Python", "JAVA", "PHP", "Perl", "C#", "C++"};

        List<String>list= Arrays.asList(arr);
        System.out.println(list);
        System.out.println(list.size());

        list.set(1,"ksk");
        System.out.println(list);
        System.out.println(Arrays.toString(arr));

        arr[0]="gs";
        System.out.println(list);
        System.out.println(Arrays.toString(arr));

    }
}
