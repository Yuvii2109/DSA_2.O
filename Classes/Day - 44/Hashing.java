public class Hashing {
    public static void main(String args[]){
        String str1 = "Yuvraj";
        System.out.println(str1.hashCode());
        Boolean val1 = true;
        System.out.println(val1.hashCode());
        Boolean val2 = false;
        System.out.println(val2.hashCode());
        Integer val3 = 123;
        System.out.println(val3.hashCode());
        Double val4 = 123.4;
        System.out.println(val4.hashCode());
        Character ch1 = 'a';
        System.out.println(ch1.hashCode());
    }
}