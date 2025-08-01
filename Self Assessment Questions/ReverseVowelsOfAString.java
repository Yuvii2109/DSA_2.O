/*
    Given a string s, reverse only all the vowels in the string and return it.

    The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.

    Example 1 -
        Input - s = "IceCreAm"
        Output - "AceCreIm"
        Explanation - The vowels in s are ['I', 'e', 'e', 'A']. On reversing the vowels, s becomes "AceCreIm".

    Example 2 -
        Input - s = "leetcode"
        Output - "leotcede"
*/

public class ReverseVowelsOfAString {
    public static boolean isVowel(char ch){
        return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U');
    }
    public static void swap(char[] arr, int i, int j){
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public String reverseVowels(String s) {
        int i = 0, j = s.length() - 1;
        char[] charArray = s.toCharArray();
        while(i < j){
            if(!isVowel(charArray[i])){
                i++;
            }else if(!isVowel(charArray[j])){
                j--;
            }else{
                swap(charArray, i, j);
                i++;
                j--;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(char c : charArray){
            sb.append(c);
        }
        return sb.toString();
    }
}