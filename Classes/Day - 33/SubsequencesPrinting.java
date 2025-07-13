public class SubsequencesPrinting {
    public static void printSubsequences(String str, int index, String ans){
        if(index == str.length()){
            System.out.println("'" + ans + "'");
            return;
        }
        printSubsequences(str, index + 1, ans + str.charAt(index));
        printSubsequences(str, index + 1, ans);
    }
    public static void main(String[] args) {
        String str = "abc";
        printSubsequences(str, 0, "");
    }
}