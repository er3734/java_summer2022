package day22_MultiDimensionalArray;

public class C03_02MdaCarpma {
    public static void main(String[] args) {
         /*
        verilen 2 katlı bir mda'de outer indexi ve inner indexi aynı olan sayıların
        carpımını bulunuz
         int [][] sayilar={{1,5,6,9},{2,5},{3,1,6}};
         [0][0]*[1][1]*[2][2].....
         */
        int [][] sayilar={{1,5,6,9},{2,5},{3,1,6}};
        int carpim=1;
        for (int i = 0; i <sayilar.length ; i++) {
            for (int j = 0; j <sayilar[i].length ; j++) {
                if (i==j){
                    carpim*=sayilar[i][j];
                }

            }
        }
        System.out.println(carpim);

    }
}
