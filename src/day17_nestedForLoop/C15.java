package day17_nestedForLoop;

public class C15 {
    public static void main(String[] args) {
        /*
    Aşağıdaki elmas deseni görüntüsünü çizen java kodunu yazınız.
    Test Data:
    Yarım elmas uzunluğu : 7
    Beklenen Çıktı:
          *
         ***
        *****
       *******
      *********
     ***********
    *************
     ***********
      *********
       *******
        *****
         ***
          *
     */
            for (int i = 1; i <=13 ; i++) {
                for (int j = 1; j <=(13-i)/2; j++) {
                    System.out.print(" ");
                }
                if(i<=7){
                    for (int j = 1; j <=((2*i)-1) ; j++) {
                        System.out.print("*");
                    }
                }else {
                    for (int j = 1; j <= i-6; j++) {
                        System.out.print(" ");
                    }
                    for (int j = 1; j <= ((2 * (14 - i)) - 1); j++) {
                        System.out.print("*");
                    }
                } System.out.println("");
            }
        }
    }

