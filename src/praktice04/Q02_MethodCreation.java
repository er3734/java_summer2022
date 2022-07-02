package praktice04;

public class Q02_MethodCreation {
      /*
     cm olarak verilen bir sayiyi, metre ve kilometreye donusturen bir method yaziniz
      */
      public static void main(String[] args) {
          double cm = 1;
          uzunlukDonusum(cm);

      }
      public static void uzunlukDonusum(double cm){
          double m=cm/100;
          double km=cm/100000;
            System.out.println(m);
            System.out.println(km);

            System.out.println(cm +"cm olarak girdiğiniz değer " + m+" m ve "+km+" km dir" );

      }
}