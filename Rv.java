import java.io.*;
import java.util.Scanner;

public class Rv {

    public static void main(String[] args) {
        String s="abc";
        Scanner sc= new Scanner(System.in);
        String a=sc.next();
        char ch;
        reverse(s);
        reverse(a);
    }
    public static Object reverse(String s) {
        String n="";
        try {
            for(int i=0;i<s.length();i++)
            {
                char ch = s.charAt(i);
                n=ch+n;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.print(n);
        return n;
    }

}
