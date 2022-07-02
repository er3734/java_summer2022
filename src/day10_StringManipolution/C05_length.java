package day10_StringManipolution;

public class C05_length {
    public static void main(String[] args) {

        //en büyük index  = str.length()-1
        String str="Java ogren, isi kap";
        System.out.println(str.length());//str in karekter sayısını dödürür

        System.out.println(str.charAt(str.length()-1));//son karekteri yazdırır

        System.out.println(str.charAt(str.length()-3));//sondan 3. karekter

        /* java da null pointer (işaretleyici) bir değer değil
        karşısına yazıldığı var. ın hiç bir değer almadığının işaretcisidir
         */

        String str2="";// hiçlik değeri vardır

        String str3=null;// değer atamamyı işaret eder değer atama değildir

        System.out.println(str3);
        System.out.println(str3.length());//değeri indexi yoktur

    }
}
