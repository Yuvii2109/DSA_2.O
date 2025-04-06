public class UnderstandingReturn {
    public static int add(){
        int a = 21;
        int b = 23;
        return a+b;
        // System.out.println(a+b); - Unreachable code as the value is already returned
    }
    public static void main(String[] args) {
        int a = add();
        System.out.println(a);
    }
}