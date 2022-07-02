package day17_nestedForLoop;

public class C11_ {
    public static void main(String[] args) {
        String input = "istanbul";
        for (int i = 1; i <= input.length(); i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(input.substring(j - 1, j) + " ");
            }
            System.out.println("");
        }
        for (int i = input.length(); i >= 1; i--) {
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(input.substring(j - 1, j) + " ");
            }
            System.out.println("");
        }
}}