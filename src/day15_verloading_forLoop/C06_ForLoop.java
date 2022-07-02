package day15_verloading_forLoop;

public class C06_ForLoop {
    public static void main(String[] args) {
        //input olara verilen stringi terse ceviren bir method
        String input="Java gun gectikce guzellesiyor";

      terstenYazdir2(input);

    }
    public static void terstenYazdir2(String input){
        //String tersInput=input.substring(input.length()-1);
        String tersInput="";
        for (int i = input.length()-1; i >=0 ; i--) {
            tersInput+=input.substring(i,i+1);

        }
        System.out.println("tersInput = " + tersInput);
    }

}
