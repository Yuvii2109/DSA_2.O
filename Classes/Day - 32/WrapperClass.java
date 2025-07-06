public class WrapperClass {
    public static void main(String[] args) {
        @SuppressWarnings("removal")
        // Explicit construction (discouraged in modern code)
        Integer a = new Integer(23);
        System.out.println("a (new Integer) - " + a);

        // Integer literal assignment (cached values for -128 to 127)
        Integer b = 23;
        System.out.println("b (Integer.valueOf) - " + b);

        // Autoboxing - primitive → wrapper
        int y = 23;
        Integer k = y;
        System.out.println("k (autoboxed from y) - " + k);

        // Unboxing - wrapper → primitive
        Integer p = 100;
        int q = p;   // auto-unboxing
        System.out.println("q (auto-unboxed from p) - " + q);

        // Explicit unboxing via intValue()
        Integer r = Integer.valueOf(200);
        int s = r.intValue();
        System.out.println("s (explicitly unboxed from r) - " + s);
    }
}