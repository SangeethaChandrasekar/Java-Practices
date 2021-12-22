import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();//Creating arraylist
        list.add("Ravi");//Adding object in arraylist
        list.add("Vijay");
        list.add("Ravi");
        list.add("Ajay");
        try {
            Iterator itr = (Iterator) list.iterator();
            list.add("abi");
            while (itr.hasNext()) {
                System.out.println(itr.next());
            }
        } catch (Exception exception) {
            System.out.println("Exception found");
            System.out.println(list);
        }
    }
    private static boolean hasNext() {
        return true;
    }
}
