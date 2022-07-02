package day19_Scope;

public class C05_Scope {
    public static void main(String[] args) {
        C04_Scope.okul();
       // C04_Scope.okul="halkalı";
        System.out.println(C04_Scope.okul);

        System.out.println("");

        C04_Scope yogretmen1=new C04_Scope();
        System.out.println(yogretmen1.isim);
        System.out.println("");
        yogretmen1.ogretmen();
        System.out.println("");
        yogretmen1.ogretmen();
    }
}
