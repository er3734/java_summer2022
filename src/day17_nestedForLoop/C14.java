package day17_nestedForLoop;

public class C14 {
    public static void main(String[] args) {
        String s="aaaa.9aa";
        int i=0;
        int kontrolc=0;
        do {
            if (!(s.charAt(i)>='a'&&s.charAt(i)<='z'||s.charAt(i)>='A'&&s.charAt(i)<='Z'||s.charAt(i)>='0'&&s.charAt(i)<='9')){
                kontrolc++;
            }
            i++;
        }while (i<s.length());
        System.out.println(kontrolc);
        if (kontrolc==0){
            System.out.println("özel karekter içermeli");
        }else {
            System.out.println("başarılı");
        }
    }
}
