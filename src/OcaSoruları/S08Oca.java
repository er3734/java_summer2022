package OcaSoruları;

import java.util.Locale;

public class S08Oca {
    public static void main(String[] args) {
        String stuff="TV";
        String res =null;

        if (stuff.equals("TV")){
            res="Walter";
        } else if (stuff.equals("Movie")) {
            res="White";
        }else
            res="No Result";
        System.out.println("res = " + res);

        res=stuff.equals("TV")?"Walter":stuff.equals("Movie")?"White":"No Result";
        System.out.println("res2 = " + res);
    }
}
