package praktice08;

public class Q02_ForEach {

    // String[] list = {"fruits", "vegetables", "meat", "milk"};
    // print array with for each loop
    // print length of each element

    // Part 2:
    // Print all the elements from array using for eachLoop
    // If an element starts with 'v' then quit the loop
    public static void main(String[] args) {
        String[] list = {"fruits", "vegetables", "meat", "milk"};
        for (String w:list
             ) {
            System.out.println(w.length()+" ");

        }
        for (String w:list
             ) {
            System.out.println(w);
            if (w.startsWith("m")){
                break;
            }

        }
    }
}
