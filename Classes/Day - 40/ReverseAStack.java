import java.util.Stack;

public class ReverseAStack {
    public static void insertAtBottom(Stack<Integer> st , int k){
        if(st.isEmpty()){
            st.push(k);
            return;
        }
        int top = st.pop();
        insertAtBottom(st, k);
        st.push(top);
    }
    public static void reverseStackRecursion(Stack<Integer> st){
        if(st.isEmpty()){
            return;
        }
        int temp = st.pop();
        reverseStackRecursion(st);
        insertAtBottom(st, temp);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        reverseStackRecursion(st);
        System.out.println(st);
    }
}