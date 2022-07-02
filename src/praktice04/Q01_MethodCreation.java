package praktice04;

public class Q01_MethodCreation {

    /*
        Problem tanımı :
        Bir String içindeki tüm karakterleri en fazla bir kez
         yazdıran parametreli bir method yazınız.
        Test Data:
        input: "aabbcccccddddaaa"
        output: abcd
     */
    public static void main(String[] args) {
        String input="aabbcccccddddaaa";
        harfDondurme(input);
        harfDondurme("ekrem");
    }
    public static void harfDondurme(String input){
        String temp=input.replaceAll("\\W","");
        String tekrarsiz=temp.substring(0,1);
        for (int i = 1; i <input.length() ; i++) {
            if(!(tekrarsiz.contains(input.substring(i,i+1)))){
                tekrarsiz+=input.substring(i,i+1);
            }
        }
        System.out.println(tekrarsiz);
    }
}