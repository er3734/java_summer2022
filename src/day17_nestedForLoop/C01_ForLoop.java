package day17_nestedForLoop;

public class C01_ForLoop {
    public static void main(String[] args) {
        //verilen String teki kullanılan harfleri tekrarsız olarak
        // yazdırıp kelimede kullanılan farklı harf sayısını veren
        // bir method yapalım
        String input="Java her zaman guzel";
        String input2="ncshusxıosdhuduıh";
        tekrarsizYap(input);
        tekrarsizYap(input2);
    }

    public static void tekrarsizYap(String input) {
        String benzersizInput="";
        String islenecekKelime=input.replaceAll("\\W","");
        System.out.print(input.substring(0,1));
        benzersizInput+=input.substring(0,1);
        for (int i = 1; i <islenecekKelime.length() ; i++) {
            islenecekKelime.substring(i,i+1);
            if(!(benzersizInput.contains(islenecekKelime.substring(i,i+1)))){
                System.out.print(","+islenecekKelime.substring(i,i+1));
                benzersizInput+=islenecekKelime.substring(i,i+1);
            }
        }
        System.out.println();
        System.out.println("input = " + input);
        System.out.println("benzersizInput = " + benzersizInput);
    }
}
