class A {
    int d = 13;
    void fun(){
        System.out.println("Fun From A");
    }
}

class B extends A {
    @Override
    void fun(){
        System.out.println("Fun From B");
    }
}

public class Overriding {
    public static void main(String[] args) {
        // B obj = new B();
        A obj = new B();
        obj.fun(); // Print Fun From B...
        System.out.println(obj.d); // Early Binding ka concept... 
        // Prints d created in A...
    }
}