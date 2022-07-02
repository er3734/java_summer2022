package day17_nestedForLoop;

public class C10 {
    public static void main(String[] args) {
        String str="Ankara";

        for (int i =1; i <=str.length() ; i++) {
            System.out.println(str.substring(0,i));
         }
        for (int i = str.length()-1; i >=1 ; i--) {
            System.out.println(str.substring(0,i));
        }}
    }

