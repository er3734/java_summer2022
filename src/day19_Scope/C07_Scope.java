package day19_Scope;

public class C07_Scope {
    static String str="star";
    int a=7;

    public static void main(String[] args) {
        System.out.println("1 "+str);
        level();
        System.out.println("3 "+str);
        level();
        C07_Scope nesne=new C07_Scope();
        nesne.nonStatic();
        System.out.println("5 "+str);

    }
    public static void level(){
        System.out.println("2 "+str);
        str="yıldız";
    }
    public void nonStatic(){
        System.out.println("4 "+str);
        str="gunes";
        a++;
    }
}
