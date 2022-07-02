package replitSorular;

public class S33ForWhile8 {
    /*'a' ile 'z' arasındaki karakterlerin a
    scii değerlerini yazdıran bir Java programı yazın.*/
    public static void main(String[] args) {
        for (char i = 'a'; i <='z' ; i++) {
            int as;
            if (i < 'z') {
                as = i;
                System.out.print(as + ",");
            } else {
                as = i;
                System.out.print(as);
            }
        }
    }
}
