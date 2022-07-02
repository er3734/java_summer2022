package replitSorular;

import java.util.Scanner;

public class S28_2ForWhile {
    public static void main(String[] args) {
        /*
        Bir String icerisinde yinelenen karakterleri döndüren bir kod yazıniz.(mülakat Sorusu)
        Input :
        String str=“Javaisalsoeasy”
        Output: a s
        */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir kelime giriniz : ");
        String kelime = scanner.nextLine();
        String tekrarlananHarf = "";

        for (int i = 0; i < kelime.length(); i++) {
            for (int j = i+1; j < kelime.length(); j++) {
                if (kelime.charAt(j) == kelime.charAt(i)) {
                    tekrarlananHarf += kelime.charAt(i);
                    kelime = kelime.replace(kelime.charAt(j), '?');
                    //TEKRARLANAN HARFİ BULDUKTAN SONRA O HARFİ
                    //METNİN KALANINDAN DİREKT SİLEMEDİM.ONUN YERİNE BASKA Bİ DEGERLE DEGİSTİRDİM
                    //SONRA YAZDIRMADAN ÖNCE O KARAKTERİ METİNDEN SİLDİM
                }
            }
        }
        tekrarlananHarf = tekrarlananHarf.replace("?","");
        for (int i = 0; i <= tekrarlananHarf.length()-1; i++) {
            System.out.print(tekrarlananHarf.charAt(i)+ " ");

           /*
            if (i<tekrarlananHarf.length()-1) {                              //SON HARFTEN SONRA BOSLUK ALMAMAK İCİN

                System.out.print(tekrarlananHarf.charAt(i)+" ");
            }else
                System.out.print(tekrarlananHarf.charAt(i));

            */
        }
    }
}
