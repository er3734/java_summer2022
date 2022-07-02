package replitIngilizceSorular;

public class Method_Array_03 {
    public static void main(String[] args) {
       /*
      Bir String'i parametre olarak kabul eden ve verilen string'de bulunan rakamların toplamını yazdıran bir metot yazın.

     girdi: ade1r4d3

        çıktı : 8  */

        String str="a4e5r7d6";
        String strRakam=str.replaceAll("\\D","");
        System.out.println(strRakam);
        int strSyi=Integer.parseInt(strRakam);
        System.out.println(strSyi);
        int top=0;
        while (strSyi>0){
            int bb=strSyi%10;
            strSyi/=10;
            top+=bb;
        }
        System.out.println(top);
    }
}
