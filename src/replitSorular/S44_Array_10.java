package replitSorular;

public class S44_Array_10 {
    public static void main(String[] args) {
     //   Bir String değişkeni cümlesi verildiğinde, her sözcüğü almak için kod yazın
        // ve tersine ters çevrilmiş String'e atayın.

            //    sentence -> "Java is fun"
        //    reversed **-> "**fun is Java**"**

        String cumle="Java is fun";
        String[]arrayCumle=cumle.split(" ");
        String reserved="";
        for (int i = arrayCumle.length-1; i >=0 ; i--) {
            reserved+=arrayCumle[i]+" ";
        }
        System.out.println(reserved);
    }
}
