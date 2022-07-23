package praktice08;

public class Q01_ForEach {

    // int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,14,15,16,17,18};
    // verilen array de once cift olan sayilari, sonra da tek olan sayilari for each loop kullanarak yazdiriniz..
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,14,15,16,17,18};
        for (int w:arr
             ) {
            if (w%2==0){
                System.out.print(w+" ");
            }
        }
        System.out.println();
        for (int w:arr
             ) {
            if (w%2!=0)
            System.out.print(w+" ");
        }
    }
}
