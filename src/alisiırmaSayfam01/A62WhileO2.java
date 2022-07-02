package alisiırmaSayfam01;

public class A62WhileO2 {
    public static void main(String[] args) {
        for (int i = 100; i <= 999; i++) {
            if (i % 15 == 0 || i % 20 == 0 || i % 90 == 0) {
                System.out.print(i + ",");
            }
        }
            System.out.println("");
            int a = 100;
            while (a <= 999) {
                if (a % 15 == 0 && a % 20 == 0 && a % 90 == 0) {
                    System.out.print(a + ",");
                }
                a++;
            }

    }
}
