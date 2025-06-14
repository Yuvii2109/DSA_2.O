public class GoodSubstring {
    public static boolean isVowel(char c){
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
            return true;
        }else{
            return false;
        }
    }
    public static void goodSubstring(String s){
        int i = 0, j = 0;
        int n = s.length();
        String temp = s;
        temp = temp.toLowerCase();
        int maxLength = 0;
        String goodString = "";
        while(i < n){
            while(i < n && (!isVowel(temp.charAt(i)))){
                i++;
            }
            j = i;
            while(i < n && (isVowel(temp.charAt(i)))){
                i++;
            }
            int l = i - j;
            if(maxLength < l){
                maxLength = l;
                goodString = s.substring(j, i);
            }
        }
        System.out.println("Longest String of vowels - " + goodString);
        System.out.println("Max length - " + goodString.length());
    }
    public static void main(String[] args) {
        String s = new String("AabccAEIuosde");
        goodSubstring(s);
    }
}