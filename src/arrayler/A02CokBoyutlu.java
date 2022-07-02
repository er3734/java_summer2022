package arrayler;

public class A02CokBoyutlu {
    public static void main(String[] args) {
       // int[] Darr=new int[5]; tek boyulu olunca
        int[][] tablo=new int[][]{
                {1,75,10},
                {2,87,13},
                {3,95,15},
                {4,103,19},
                {5,110,18}
        };
        /*int[][] tablo2=new int[4][2];
        tablo2[0][0]=1;
        tablo2[0][1]=75;
        tablo2[0][2]=10;*/

        for (int i = 0; i <tablo.length ; i++) {
            for (int j = 0; j <tablo[0].length ; j++) {
                System.out.print(tablo[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
