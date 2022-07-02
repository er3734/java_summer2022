package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C08_Array {
    public static void main(String[] args) {
        String str[]=new String[4];
        System.out.println(str.length);
        System.out.println(Arrays.toString(str));
       str[1]="erdi";
        str[3]="hatice";

        //str[6]="mahmut";
        System.out.println(Arrays.toString(str));
        Scanner scan=new Scanner(System.in);

        for (int i = 0; i <str.length ; i++) {
            System.out.println("str ye değer giriniz");
            str[i]=scan.nextLine();
            System.out.println(str[i]);
        }
        System.out.println(Arrays.toString(str));
    }
}
