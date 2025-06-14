public class FirstNonRepeatingCharacter {
    public static char firstNonRepeatingCharacter(String s){
        int[] charArr = new int[26];
        for(char ch : s.toCharArray()){
            charArr[ch - 'a']++;
        }
        for(char ch : s.toCharArray()){
            if(charArr[ch - 'a'] == 1){
                return ch;
            }
        }
        return '$';
    }
    public static void main(String[] args) {
        String s = "racecar";
        char c = firstNonRepeatingCharacter(s);
        System.out.println("First non repeating character - " + c);
    }
}