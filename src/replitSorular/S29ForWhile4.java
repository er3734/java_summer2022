package replitSorular;

public class S29ForWhile4 {
    public static void main(String[] args) {
        /*irdi olarak bir tamsayı kabul eden ve faktöriyel hesaplayan programi yazıniz.
                Giriş : 6
        Çıktı: 6!=6 5 4 3 2*1=720*/
<<<<<<< HEAD

        int input = 7;
        int fak = 1;
        if (input > 0 && input < 20) {
            for (int i = input; i >= 1; i--) {
                fak *= i;
                if (i > 1) {
                    System.out.print(i + "*");
                } else System.out.print(i);
            }
            System.out.println(" = " + fak);
        }else
            System.out.println("yanlış sayı girdiniz");
    }
    
=======
    }
>>>>>>> 7e6f873aecd00867db15615b9dbce48ba4389557
}
