import java.util.Stack;

public class StackPractice {

    public Boolean empty(){
        return true;
    }

    public static void main(String[] args) {
        Stack<Integer> stk = new Stack<>();
        boolean result= stk.empty();
        System.out.println(result);
        stk.push(10);
        System.out.println(stk.peek());
        stk.push(25);
        stk.push(34);
        System.out.println("Top element :"+stk.peek());
        System.out.println(stk);
        int l=stk.size();
        System.out.println(l);
        stk.pop();
        System.out.println(stk);
        stk.pop();
        stk.pop();
        System.out.println(stk);
        result= stk.empty();
        System.out.println(result);
    }
}
