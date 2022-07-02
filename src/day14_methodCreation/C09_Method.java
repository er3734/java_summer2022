package day14_methodCreation;

public class C09_Method {
    public static void main(String[] args) {
        //toplam(4,5);
        //karelerTop(4,5);
        //carpma(4,5);
        System.out.println(toplam(4,5)+karelerTop(4,5)+carpma(4,5));
        sayTop();
        System.out.println(sayTop());



    }
    public static int toplam(int a, int b){
        int top=a+b;
        return top;
    }
    public static int karelerTop(int a,int b){
        int ktop=(a*a)+(b*b);
        return ktop;
    }
    public static int carpma(int a,int b){
        int carpım=2*a*b;
        return carpım;
    }
    public static String sayTop(){
        String inpt1="Sayıların karesi toplamı";
        return inpt1;
    }
}
