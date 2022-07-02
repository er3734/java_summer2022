package arrayler;

import java.util.Arrays;

public class A05CokBoyut {
    public static void main(String[] args) {
        int [][] arr={{1,2,3},{4,5,6}};
        System.out.println("0'a 0 : "+arr[0][0]);
        System.out.println("1'ye 1 : "+arr[1][1]);
        System.out.println(arr[0][2]);//30
        System.out.println(arr[1][2]);//60
        System.out.println(arr[1][0]);//40
        System.out.println(arr[0][1]);//20
        System.out.println(Arrays.toString(arr[0]));//10,20,30
        System.out.println(Arrays.toString(arr[1]));//40,50,60
        System.out.println(Arrays.deepToString(arr));//10,20,30--40,50,60*/
        int carpım=1;
        System.out.println(arr.length);
        System.out.println(arr[0].length);

        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
              carpım=carpım*arr[i][j];
            }
        }
        System.out.println(carpım);
    }
}
