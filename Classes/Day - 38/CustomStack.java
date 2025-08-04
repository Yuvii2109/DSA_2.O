import java.util.ArrayList;

class Stack {
    ArrayList<Integer> al;

    Stack(){
        al = new ArrayList<>();
    }

    public boolean isEmpty(){
        return al.size() == 0;
    }

    public int size(){
        return al.size();
    }

    public void push(int val){
        al.add(val);
    }

    public int pop(){
        int removed = -1;
        if(!al.isEmpty()){
            removed = al.remove(al.size() - 1);
        }
        return removed;
    }

    public int peek(){
        int peekVal = -1;
        if(!al.isEmpty()){
            peekVal = al.get(al.size() - 1);
        }
        return peekVal;
    }
}

public class CustomStack {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println(s.isEmpty());
        System.out.println(s.size());
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s.peek());
        System.out.println(s.size());
    }
}