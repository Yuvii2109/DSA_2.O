public class ReverseString {
    // Time complexity - O(n^2)
    public static String reverseString(String s){
        String result = "";
        for(int i = s.length()-1; i >= 0; i--){
            result += s.charAt(i);
        }
        return result;
    }
    public static String reverseStringUpgrade(String s){
        StringBuilder sb = new StringBuilder();
        for(int i = s.length()-1; i >= 0; i--){
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
    public static boolean arePalindromic(String s1, String s2){
        if(s1.equals(s2)){
            return true;
        }else{
            return false;
        }
    }
    public static boolean arePalindromicUpgrade(String s){
        int i = 0, j = s.length()-1;
        while(i < j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        String s1 = "yuvraj";
        String s2 = reverseStringUpgrade(s1);
        System.out.println(s2);
        if(arePalindromicUpgrade(s1)){
            System.out.println("String's palindromic");
        }else{
            System.out.println("It's not palindromic");
        }
    }
}