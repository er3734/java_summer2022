package day18_WhileLoop;

public class C01_WhilLoop {
    public static void main(String[] args) {
        //soru4
        char ilkHarf='f';
        char sonHarf='t';

        char temp=ilkHarf;
        String buyult="";

        while (temp<=sonHarf) {
            buyult = (temp + "").toUpperCase();
            System.out.print( buyult+" ");
            temp ++;
        }
    }
}
