public class StringSubsequence {
    public static int count = 0;
    public static void printSubsequences(String str, int index, String ans){
        if(index == str.length()){
            System.out.println('"' + ans + '"');
            count++;
            return;
        }
        // Including current character
        printSubsequences(str, index + 1, ans + str.charAt(index));
        // Not including current character
        printSubsequences(str, index + 1, ans);
    }
    public static void printSubsequences(String str, String ans){
        if(str.length() == 0){
            System.out.println('"' + ans + '"');
            count++;
            return;
        }
        char ch = str.charAt(0);
        String smallProb = str.substring(1);
        printSubsequences(smallProb, ans + ch); // Including character - ch
        printSubsequences(smallProb, ans); // Not including character - ch
    }
    public static void main(String[] args) {
        String str = "abc";
        printSubsequences(str, "");
        System.out.println("Number of subsequences - " + count);
    }
}