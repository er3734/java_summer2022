package day17_nestedForLoop;

public class C04_NestedForLoop {
    public static void main(String[] args) {
        /*
        verilen inputa göre yıldızlardan oluşan
        bir üçgen oluşturun
        inpu=4 ise
        *
        **
        ***
        ****
         */
        int input=5;
        for (int i = 1; i <=input ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("*"+" ");}
            System.out.println("");}

             /* An
                    Ank
                    Anka
                    Ankar
                    Ankara
                    Ankar
                    Anka
                    Ank
                    An
                    A*/
        String input1 = "Ankara";
        for (int i = 0; i <= input1.length(); i++) {
            System.out.println(input1.substring(0, i));
        }
        for (int i = input1.length() ; i >0; i--) {
            System.out.println(input1.substring(0, i - 1));
        }
    }
}



