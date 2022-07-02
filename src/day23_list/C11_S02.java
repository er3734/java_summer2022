package day23_list;

public class C11_S02 {
    public static void main(String[] args) {
        int[]dizi={2,3,5,3,2,6,85,9,2,5,78,32,2,3,5,7,9};


        benzersizArray(dizi);

    }

    private static void benzersizArray(int[] dizi) {
        String sDizi="";
        for (int i = 0; i < dizi.length ; i++) {
            sDizi+=dizi[i];
        }
        System.out.println(sDizi);
        String unique="";
        for (int i = 0; i <sDizi.length() ; i++) {
            if (!(unique.contains(sDizi.substring(i,i+1)))){
                unique+=sDizi.substring(i,i+1);

            }
        }
        System.out.println(unique);

    }
}
