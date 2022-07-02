package replitSorular;

public class S28ForWhile3 {
    public static void main(String[] args) {
       /* Bir String icerisinde yinelenen karakterleri döndüren bir kod yazıniz.(mülakat Sorusu)
        Giriş :
        String str = “Javaisalsoeasy”
        Çıktı: olarak as*/

        String str="javasalsoeasy";
        String kar="";
        String tekrarEden="";

        for (int i = 0; i <=str.length()-1 ; i++) {
            kar=str.substring(i,i+1);
            int index=str.indexOf(kar);
            int sonindex=str.lastIndexOf(kar);
            if (index!=sonindex){
                if (!(tekrarEden.contains(kar))) {
                    tekrarEden += kar+",";
                }
            }
        }
        System.out.println("tekrarEden = " +
                tekrarEden.substring(0,tekrarEden.length()-1));
    }
}
