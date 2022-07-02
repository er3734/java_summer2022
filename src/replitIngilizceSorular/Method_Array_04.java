package replitIngilizceSorular;

import java.util.Arrays;

public class Method_Array_04 {
   /* Özel bir dönüş türü oluştur yöntemi, bir adı parametre olarak kabul eder ve adı bir karakter dizisi olarak yazdırır.

            (toCharArray() yöntemini kullanmayın)

    Girdi: John

    Çıktı :[J, o, h, n]*/
   public static void main(String[] args) {


    String str="john";
   char arrayStr[]=new char[str.length()];

   arrayStr[0]=str.charAt(0);
   arrayStr[1]=str.charAt(1);
   arrayStr[2]=str.charAt(2);
   arrayStr[3]=str.charAt(3);
       System.out.println(Arrays.toString(arrayStr));

       for (int i = 0; i <arrayStr.length ; i++) {
           arrayStr[i]=str.charAt(i);

       }
       System.out.println("  "+Arrays.toString(arrayStr));

}}
