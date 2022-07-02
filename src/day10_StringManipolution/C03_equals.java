package day10_StringManipolution;

public class C03_equals {
    public static void main(String[] args) {
        String str="Ali Can";
        String str2="Ali CAN";
        String str3="Ali Can" + "";
        String str4="Ali Can";
        String str5=new String("Ali Can");

        System.out.println(str==str2);//false

        System.out.println(str==str3);//true
        System.out.println(str.equals(str3));//true

        System.out.println(str==str5);//false
        System.out.println(str.equals(str5));//true

        System.out.println(str3.equals(str5));//true
        System.out.println(str3==str5);//false

        /*
        Stringler de aynı string olsa bile == her zaman çalışmaz
        emin olmak için isterseniz equals kullanmalısınız

        equals kullandığınızda dikkat edeceğiniz tek sey metinlerin
        birebir aynı olmasıdır
         */
    }
}
