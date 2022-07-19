package javaITSorulari_Loop;

public class S10 {
    public static void main(String[] args) {
        //Verilen ondalık sayının sadece ondalık kısmındaki rakamları
        // bir asteriks ile yazdırmak için kodu yazın. Örneğin;
        //75.4238 ==> *4*2*3*8

        double sayi=75.4238;
        String str= String.valueOf(sayi);
        System.out.println(str);
        int index=str.indexOf(".");
        System.out.println(index);
        
        String asteriks="";
        for (int i = index+1; i <str.length() ; i++) {
            asteriks+="*"+str.charAt(i);
        }
        System.out.println("asteriks = " + asteriks);
    }
}
