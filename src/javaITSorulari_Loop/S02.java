package javaITSorulari_Loop;

public class S02 {
    public static void main(String[] args) {
        //Bir Dize'de tekrarlanan karakterleri yazdırmak için kod yazın.
        // Örneğin; aksesuarlar
        
        String str="aksesuarlar";
        String tekrarlıHarfler="";
        for (int i = 0; i <str.length() ; i++) {
            if (str.indexOf(str.charAt(i))!=str.lastIndexOf(str.charAt(i))){
                if (!tekrarlıHarfler.contains(str.substring(i,i+1))){
                    tekrarlıHarfler+=str.substring(i,i+1);
                }
            }
        }
        System.out.println("tekrarlıHarfler = " + tekrarlıHarfler);
    }
}
