/*
    Given a string s and an integer k, reverse the first k characters for every 2k characters counting from the start of the string.

    If there are fewer than k characters left, reverse all of them. If there are less than 2k but greater than or equal to k characters, then reverse the first k characters and leave the other as original.

    Example 1 -
        Input - s = "abcdefg", k = 2
        Output - "bacdfeg"

    Example 2 -
        Input - s = "abcd", k = 2
        Output - "bacd"
*/

public class ReverseStringII {
    public String reverseStr(String s, int k) {
        char[] chars = s.toCharArray();
        int n = chars.length;
        for(int start = 0; start < n; start += 2 * k){
            int end = Math.min(n - 1, start + k - 1);
            reverse(chars, start, end);
        }
        return new String(chars);
    }
    private static void reverse(char[] chars, int i, int j){
        while(i < j){
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
            i++;
            j--;
        }
    }
}