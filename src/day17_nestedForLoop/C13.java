package day17_nestedForLoop;

public class C13 {
    public static void main(String[] args) {

        String input="ghsdjkasashsxdskmxA@gmail.comSASAS@gmail.com";

        if(!input.contains("@gmail.com")){
            System.out.println("lutfen gmail adresi griniz");
        }else
            if(!input.endsWith("@gmail.com")){
                System.out.println("sonu gmail ile bitmeli");
            }
        System.out.println("şifre doğru");

    }
}
