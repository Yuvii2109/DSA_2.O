public class StringDemo {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        String str1 = new String("Yuvraj"); // Creating a String by new keyword
        String str2 = "Sachdeva"; // Creating a String by String literal
        System.out.print(str1 + " ");
        System.out.println(str2);
        for(int i = 0; i < str1.length(); i++){
            System.out.println(str1.charAt(i));
        }
        System.out.println(str2.substring(0, 5));
    }
}