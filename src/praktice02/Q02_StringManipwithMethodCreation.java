package praktice02;

<<<<<<< HEAD
import java.util.Scanner;

=======
>>>>>>> 7e6f873aecd00867db15615b9dbce48ba4389557
public class Q02_StringManipwithMethodCreation {
    /*
     * girilen String icinde "xyz" dizimi var ise true degilse false return eden metod yaziniz
     *
     * input      output
     * axyzm  ==   true
     * xyz    ==   true
     * x.yz   ==   false
     * xyaz   ==   false
     */
    public static void main(String[] args) {
<<<<<<< HEAD
        Scanner scan=new Scanner(System.in);
        System.out.println("bir string giriniz");
        String str=scan.nextLine();
        System.out.println(xyzVarmi(str));

    }
    public static boolean xyzVarmi(String str) {
        if (str.contains("xyz")){
            return true;
        }else {
            return false;
=======
        String input="erdibxyz";

        if (input.contains("xyaz")){
            System.out.println(true);
        }else {
            System.out.println(false);
>>>>>>> 7e6f873aecd00867db15615b9dbce48ba4389557
        }
    }
}