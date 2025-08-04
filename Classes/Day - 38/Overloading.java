class A {
    long sum(int a, int b){
        return a + b;
    }
    long sum(int a, int b, int c){
        return a + b + c;
    }
}

public class Overloading {
    public static void main(String[] args) {
        A obj = new A();
        System.out.println(obj.sum(21, 23));
        System.out.println(obj.sum(21, 23, 2123));
    }
}