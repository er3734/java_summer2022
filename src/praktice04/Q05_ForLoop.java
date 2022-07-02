package praktice04;

public class Q05_ForLoop {

    // 0-255 e kadar olan harflerin , sayı ve harf değerini ekrana yazdırınız.
    public static void main(String[] args) {
        System.out.println("for ile");
        for (int i = 0; i <=255 ; i++) {
            char a= (char) i;
            System.out.println(i +"-->"+a);

        }
        System.out.println("while ile");
        int i=0;
        while (i<=255){
            char c= (char) i;
            System.out.println(i+"-->"+c);
            i++;
        }
        System.out.println("do while ile");
        int y=0;
        do {
            char b= (char) y;
            System.out.println(y+"-->"+b);
            y++;
        }while (y<=255);
    }

}