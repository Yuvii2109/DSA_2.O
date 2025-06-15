public class FaultyKeyboard {
    public static boolean sCanForm(String s, String t){
        // This code tackles long presses and not the generation of different characters
        int i = 0, j = 0;
        if(s.length() > t.length()) return false;
        while(i < s.length() && j < t.length()){
            if(s.charAt(i) == t.charAt(j)){
                i++;
                j++;
            }else if(i > 0 && s.charAt(i-1) == t.charAt(j)){
                j++;
            }else{
                return false;
            }
        }
        char last = s.charAt(s.length() - 1);
        while (j < t.length()) {
            if (t.charAt(j) != last) return false;
            j++;
        }
        return i == s.length();
    }
    public static void main(String[] args) {
        String s = "ananya";
        String t = "aannaannnyyaaa";
        if(sCanForm(s, t)){
            System.out.println("Original String can be formed");
        }else{
            System.out.println("Original String can't be formed");
        }
    }
}