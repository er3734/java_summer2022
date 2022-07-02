package day21_Arrays;

public class C11_CokBoyutluS02 {
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5},{6},{1,4,1}};
        int carpim=1;
        System.out.println(arr[0][arr[0].length-1]);
        System.out.println(arr[1][arr[1].length-1]);
        System.out.println(arr[2][arr[2].length-1]);
       for (int i = 0; i <arr.length ; i++) {

           carpim*=arr[i][arr[i].length-1];
        }
        System.out.println(carpim);
    }
}
