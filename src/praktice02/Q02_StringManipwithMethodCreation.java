package praktice02;

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
        String input="erdibxyz";

        if (input.contains("xyaz")){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
    }
}