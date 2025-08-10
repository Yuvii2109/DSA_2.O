import java.util.Stack;

public class StackJCF {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<Integer>();
        st.push(10);
        st.push(20);
        st.push(30);
        System.out.println("Stack elements - " + st);
        System.out.println("Stack size - " + st.size());
        System.out.println("Peek Element - " + st.peek());
        System.out.println("Pop Element - " + st.pop());
        System.out.println("Stack elements after pop - " + st);
    }
}