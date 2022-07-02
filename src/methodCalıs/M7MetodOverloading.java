package methodCalıs;

public class M7MetodOverloading {
    public static void top(int a,int b,int c){
        System.out.println("toplam : " + (a+b+c));
    }
    public static void top(int a,int b) {
        System.out.println("toplam : " + (a + b));
    }
    public static void top(int a,int b,int c,int d) {
        System.out.println("toplam : " + (a + b + c + d));
    }

    public static void main(String[] args) {
        top(1,2,3);
        top(4,5);
        top(1,56,78,3);
        top(12,34);

    }
}
