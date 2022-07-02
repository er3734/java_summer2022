package r02_recap;

public class Q04_NestedIfandTernary {
     /*
    0 ~ 9 arasındaki sayilari cevirebilen bir java programi yazin
   kelimelere, sayı 9'dan buyuk veya sifirdan kucukse,
   cikis "Gecersiz" olmalidir
   NestedIf ve Ternary kullanarak 2 yolla da cozunuz
 */
     public static void main(String[] args) {
          int a=-1;
          System.out.println(a==0?"sıfır":a==1?"bir":a==2?"iki":a==3?"üç":
                  a==4?"dört":a==5?"beş":a==6?"altı":a==7?"yedi":a==8?"sekiz":a==9?"dokuz":"cıkış");
          
          int b=0;
          String sonuc="";
          if (b>=0&&b<=9){
               if (b==9){sonuc="dokuz";}
               else if (b==8) {sonuc="sekiz";}
               else if (b==7) {sonuc="yedi";}
               else if (b==6) {sonuc="altı";}
               else if (b==5) {sonuc="beş";}
               else if (b==4) {sonuc="dört";}
               else if (b==3) {sonuc="üç";}
               else if (b==2) {sonuc="iki";}
               else if (b==1) {sonuc="bir";}
               else sonuc="sıfır";
          }else sonuc="gecersiz";
          System.out.println("sonuc = " + sonuc);
          

     }
}