package replitSorular;

public class S20 {
    public static void main(String[] args) {

         double a= 12345.0;
         double b= 98765.0;

         double top=a+b;

        if (a>=0&&a<1000000000&&b>=0&&b<1000000000){
            System.out.println(top);
        } else if (a>1000000000||b>1000000000||top>1000000000) {
            System.out.println("OverFlow");
        }









    }
}
