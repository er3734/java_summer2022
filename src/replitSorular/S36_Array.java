package replitSorular;

import java.util.Arrays;

public class S36_Array {
    public static void main(String[] args) {
      /*  Karışık verilen sayıları ve kelimeleri sıralayan Java kodunun yazınız.

                not: Test datadaki değerleri kullanınız.*/
        arraySırala();
    }

    private static void arraySırala() {
        int nums[]={1232, 1134,2345,1022};
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        String programlar[]={"Java", "Python", "PHP", "C#", "C Programming", "C++"};
        Arrays.sort(programlar);
        System.out.println(Arrays.toString(programlar));
    }
}
