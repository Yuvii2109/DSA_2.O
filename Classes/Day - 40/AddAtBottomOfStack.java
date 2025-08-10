import java.util.Stack;

public class AddAtBottomOfStack {
    public static void recursionAddAtBottom(Stack<Integer> st, int a){
        if(st.isEmpty()){
            st.push(a);
            return;
        }
        int top = st.pop();
        recursionAddAtBottom(st, a);
        st.push(top);
    }
    public static void addAtBottom(Stack<Integer> st, int a){
        Stack<Integer> temp = new Stack<>();
        while(!st.isEmpty()){
            temp.push(st.pop());
        }
        st.push(a);
        while(!temp.isEmpty()){
            st.push(temp.pop());
        }
        System.out.println(st);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        recursionAddAtBottom(st, 5);
        System.out.println(st);
    }
}