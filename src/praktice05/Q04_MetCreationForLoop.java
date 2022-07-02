package praktice05;

public class Q04_MetCreationForLoop {


		/* Interview Question
		 Write a Java program to reverse a string. Use for loop and create a method called
		  reverseString */
        public static void main(String[] args) {
            String str="erdi balta";

            System.out.println(tersStr(str));

        }
        public static String tersStr(String str){
            String tersSter="";
            for (int i =str.length() ; i >=1 ; i--) {
                tersSter+=str.substring(i-1,i);
            }
          return tersSter;
        }
}