package day19_Scope;

public class C06_Scope {

    String str="Erdi";

    public static void main(String[] args) {
        C06_Scope nesne1=new C06_Scope();
        System.out.println("1 " +nesne1.str);
        nesne1.str="hatice";
        System.out.println("");
        isim();
        System.out.println("4 " +nesne1.str);
        isim();
        C06_Scope nesne3 =new C06_Scope();
        System.out.println("5 "+nesne3.str);

    }

    public static void isim(){
        C06_Scope nesne2=new C06_Scope();
        System.out.println("2 " +nesne2.str);
        nesne2.str="balta";
        System.out.println("3 " +nesne2.str);


    }
}
