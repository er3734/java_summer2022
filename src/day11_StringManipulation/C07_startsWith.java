package day11_StringManipulation;

public class C07_startsWith {
    public static void main(String[] args) {
        String input="Java gun gectikçc guzellesiyor";

        System.out.println(input.startsWith("J"));//true
        System.out.println(input.startsWith(""));//true
        System.out.println(input.startsWith("gun",5));
    }
}
