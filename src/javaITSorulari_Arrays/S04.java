package javaITSorulari_Arrays;

public class S04 {
    public static void main(String[] args) {
       // Dize 'n' veya 'k' ile bitiyorsa, bir String dizisindeki öğelerin baş harflerini alın
       String[]dizi= {"kemal","ali","mehmet","orhan","berk" };
       String str="";
       String str2="";
       /* for (int i = 0; i < dizi.length ; i++) {
            str=dizi[i];
            if (str.substring(str.length()-1).equals("n")||str.substring(str.length()-1).equals("k")){
                str2+=str.substring(0,1);
            }

        }
        System.out.println(str2);*/
        for(String w : dizi){
            System.out.print(w+" ");
            if (w.endsWith("n")||w.endsWith("k")){
                str+=w.substring(0,1);
            }

        }

        System.out.println(str);
    }
}
