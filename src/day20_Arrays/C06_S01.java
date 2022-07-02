package day20_Arrays;

import java.util.Arrays;

public class C06_S01 {
    public static void main(String[] args) {
        String names[]={"Ali","Veli","Ayşe","Fatma"};
        System.out.println(Arrays.toString(names));

        int numbers[]={1,23,37,23,21,34};
        System.out.println(Arrays.toString(numbers));

        names[0]="Can";
        names[2]="Gul";
        System.out.println(Arrays.toString(names));

        numbers[5]=123;
        numbers[3]=0;
        System.out.println(Arrays.toString(numbers));

        int size=numbers.length;
        int sizeN=names.length;
        System.out.println(sizeN);
        System.out.println(size);
        System.out.println(sizeN+size);
    }
}
