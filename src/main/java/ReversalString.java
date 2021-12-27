import java.util.Scanner;
class Reverse {
    public static String methodTwo(String s) {
        char ch;
        String rev = "";
        System.out.println("Given String:" + s);
        if (s.matches("[a-z A-Z]+")) {
            for (int i = 0; i < s.length(); i++) {
                ch = s.charAt(i);
                rev = ch + rev;
            }
            System.out.println("Reversed String:" + rev);
        } else {
            System.out.println("Error!!");
        }
        return rev;
    }
}
public class ReversalString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Reverse reverseString = new Reverse();
        reverseString.methodTwo(str);
    }
}