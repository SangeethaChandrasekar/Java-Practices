import java.util.*;
public class Rv {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str= sc.nextLine();
        char ch;
        String rev="";
        method(str);
        if(str.matches("[a-z A-Z]+"))
        {
            for(int i=0;i<str.length();i++)
            {
                ch=str.charAt(i);
                rev=ch+rev;
            }
            System.out.println(rev);
        }
        else
        {
            System.out.println("Error!!");
        }
    }
    public static String method(String str){
        return str;
    }
}
