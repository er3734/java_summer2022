package day06_concatenation;

public class C02_Concatinatin {
    public static void main(String[] args) {
        String str1="Java";
        String str2= "Guzeldir";
        int s1= 5;
        int s2= 4;
        System.out.println(str1 + " " + str2 +s1+s2);
        System.out.println(str1 + " " + str2 +(s1+s2));
        System.out.println(s1+s2+ " " +str1);
        System.out.println(""+s1+s2 + " " + str2);

        System.out.println(str1.concat(str2));//JavaGuzeldir
        System.out.println(str1.concat(" ").concat(str2)); //Java Guzeldir

    }
}
