package day21_Arrays;

public class C03_2_Contains {
    public static void main(String[] args) {
        char harfler[]={'a','h','d','l','f','h'};
        char arananHarf='d';

        boolean varMı=icerdeMi(harfler,arananHarf);
        System.out.println(varMı);
        if (varMı){
            System.out.println("aranan harf dizide var");
        }else
            System.out.println("aranan harf dizide yok");
    }

    private static boolean icerdeMi(char[] harfler, char arananHarf) {
        boolean varMı = false;
        for (int i = 0; i < harfler.length; i++) {
            if (arananHarf == harfler[i]) {
                varMı = true;
            }
        }
        return varMı;
    }
}
