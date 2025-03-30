public class TypeCasting {
    public static void main(String[] args) {
        int a = 13;
        double b = a;
        System.out.println(b); // Implicit Type Conversion

        float c = 21.23f;
        int d = (int)c;
        System.out.println(d); // Explicit Type Conversion

        char e = 'a';
        int f = e;
        System.out.println(f); // Implicit Type Conversion

        int g = 65;
        char h = (char)g; // Explicit Type Conversion
        System.out.println(h);
    }
}