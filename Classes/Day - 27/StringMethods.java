class MyString {
    String s;
    public MyString(String s){
        this.s = s;
    }
    public int compareTo(MyString other){
        int l1 = this.s.length();
        int l2 = other.s.length();
        int minLen = Math.min(l1, l2);
        for(int i = 0; i < minLen; i++){
            char c1 = this.s.charAt(i);
            char c2 = other.s.charAt(i);
            if(c1 != c2){
                return c1 - c2;
            }
        }
        return l1 - l2;
    }
}
public class StringMethods {
    public static void main(String args[]){
        MyString s1 = new MyString("yuvraj");
        MyString s2 = new MyString("rajvir");
        System.out.println(s1.compareTo(s2));
    }
}