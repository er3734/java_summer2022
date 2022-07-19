package alistirmaSayfam02;

public class A23_ForEachS01 {
    public static void main(String[] args) {
        int[]dizi={4,5,6,2,7};
        int carpim=1;
        for (int w:dizi) {
            carpim*=w;
            
        }
        System.out.println("carpim = " + carpim);
        
    }
}
