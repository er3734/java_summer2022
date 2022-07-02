package methodCalıs;

public class M6ReturnVoidOr {
    public static int bir(int a){

        return a*3;
    }
    public static int iki(int b){

        return b+4;
    }
    public static int uc(int c){

        return c-2;
    }
    public static void main(String[] args) {
        System.out.println("sonuc : " + uc(iki(bir(5))) );
        System.out.println(bir(3)+iki(3)*uc(5));


    }
}
