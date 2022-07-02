package day22_MultiDimensionalArray;

public class C03_MDAIstenenSayilariYazdirma {
    public static void main(String[] args) {
        /*
        verilen 2 katlı bir mda'de outer indexi ve inner indexi aynı olan sayıların
        toplamını bulunuz
         int [][] sayilar={{1,5,6,9},{2,5},{3,1,6}};
         [0][0]+[1][1]+[2][2].....
         */
        int [][] sayilar={{1,5,6,9},{2,5},{3,1,6}};
        int top=0;
        for (int i = 0; i <sayilar.length ; i++) {
            for (int j = 0; j <sayilar[i].length ; j++) {
                if(i==j){
                    top+=sayilar[i][j];
                }
            }
        }
        System.out.println(top);
    }
}
