package javaITSorulari_Arrays;

public class S08 {
    public static void main(String[] args) {
        //) İlk ve son karakterleri aynı olan dizi öğelerini bulmak için kod yazın
        String[] arr = new String[]{"alabama", "pick", "sos", "sets", "pex"};
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i].substring(0,1).equals(arr[i].substring(arr[i].length()-1))){
                System.out.print(arr[i]+" ");
            }

        }
    }
}
