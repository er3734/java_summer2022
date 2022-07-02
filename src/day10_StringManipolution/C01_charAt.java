package day10_StringManipolution;

public class C01_charAt {
    public static void main(String[] args) {

        String str="java öğrenmek ne güzel";

        System.out.println(str.charAt(0));//ilk garf

        System.out.println(str.toUpperCase().charAt(7));//7.index R

        System.out.println(str.charAt(21));//l en son harf

        //System.out.println(str.charAt(22));// hata verir indexten fazla olduğu için
        // string metodlaerda kullanmmamız gereken bir method varsa
        //charat önce kullanmalıdır


    }
}
