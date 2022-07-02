package day12_stringManupolition;

public class Odev6 {
    public static void main(String[] args) {
      
        String sifre ="Javacandır";

        char ilkHarf=sifre.substring(0,1).charAt(0);
        //System.out.println(ilkHarf);
        char sonHarf=sifre.substring(sifre.length()-1).charAt(0);
        //System.out.println("sonHarf = " + sonHarf);

        if (ilkHarf>='A'&&ilkHarf<='Z'&&sonHarf>='a'&&sonHarf<='z'&&
        !sifre.contains(" ")&&sifre.length()>=8){
            System.out.println("şifre doğru");
        }else
            System.out.println("şifre yanlış");

    }
}
