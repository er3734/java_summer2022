package javaITSorulari_Arrays;

public class S05 {
    public static void main(String[] args) {
        //String dizi öğelerinde kullanılan toplam karakter sayısını bulun
        String[]dizi= {"kemal","ali","mehmet","orhan","berk"};
        int top=0;
        
        
        /*for (String str:dizi){
            top+=str.length();
        }
        System.out.println("top = " + top);*/
        for (int i = 0; i < dizi.length ; i++) {
            top+=dizi[i].length();
        }
        System.out.println("top = " + top);
    }
}
