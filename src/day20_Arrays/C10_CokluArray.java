package day20_Arrays;

import java.util.Arrays;

public class C10_CokluArray {
    public static void main(String[] args) {
        char dizi[][]=new char[3][5];
        dizi[0][0]='a';
        dizi[0][1]='b';
        dizi[0][2]='c';
        dizi[0][3]='d';
        dizi[0][4]='e';
        dizi[1][0]='f';
        dizi[1][1]='g';
        dizi[1][2]='h';
        dizi[1][3]='i';
        dizi[1][4]='j';
        dizi[2][0]='k';
        dizi[2][1]='l';
        dizi[2][2]='m';
        dizi[2][3]='n';
        dizi[2][4]='o';
        System.out.println(Arrays.deepToString(dizi));
       /* for (int i = 0; i <3 ; i++) {
            for (int j = 0; j <5 ; j++) {
                System.out.print(dizi[i][j]+",");}*/
        for (int i = 0; i <dizi.length ; i++) {
            for (int j = 0; j <dizi[i].length ; j++) {
            }
        }

        }
    }

