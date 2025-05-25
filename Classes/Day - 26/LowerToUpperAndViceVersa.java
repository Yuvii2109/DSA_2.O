public class LowerToUpperAndViceVersa {
    public static String convert(String s){
        String result = "";
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch >= 'a' && ch <= 'z'){
                result += (char)(ch + 'A' - 'a');
            }else{
                result += (char)(ch + 'a' - 'A');
            }
        }
        return result;
    }
    public static String convertUpgrade(String s){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch >= 'a' && ch <= 'z'){
                sb.append((char)(ch + 'A' - 'a'));
            }else{
                sb.append((char)(ch + 'a' - 'A'));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String s1 = "YuVrAj";
        String s2 = convertUpgrade(s1);
        System.out.println(s2);
    }
}