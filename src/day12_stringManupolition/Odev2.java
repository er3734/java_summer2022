package day12_stringManupolition;

public class Odev2 {
    public static void main(String[] args) {

        String a="$13.99";
        String b="$10.55";


        a=a.replace("$","");
        b=b.replace("$","");

        //double c=Double.parseDouble(a);
        //double d=Double.parseDouble(b);
        //System.out.println(c+d+"$");

        System.out.println(Double.parseDouble(a)+Double.parseDouble(b)+"$");
    }

}
