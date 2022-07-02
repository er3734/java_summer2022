package arrayler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class A13 {
    public static void main(String[] args) {
        List<String>list=new ArrayList<>();
        list.add("at");
        list.add("aslan");
        String arr[]=list.toArray(new String[2]);
        System.out.println(list);
        System.out.println(Arrays.toString(arr));
        list.add("inek");
        System.out.println(list);
        System.out.println(Arrays.toString(arr));

        Object arr2[]=list.toArray();
        System.out.println(Arrays.toString(arr2));
    }
}
