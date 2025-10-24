import java.util.Scanner;
import java.util.Stack;

/*
    Given an array of patterns containing only I’s and D’s. I for increasing and D for decreasing. Devise an algorithm to print the minimum number following that pattern. Digits from 1-9 and digits can’t repeat.

    Input Format - The First Line contains an Integer N, size of the array. Next Line contains N Strings separated by space.
    Constraints - 1 ≤ T ≤ 100 1 ≤ Length of String ≤ 8
    Output Format - Print the minimum number for each String separated by a new Line.
    Sample Input - 
        5
        D I DD II IDI
    Sample Output - 
        21
        12
        321 
        123
        1324
    Explanation - For the Given sample case, For a Pattern of 'D' print a decreasing sequence which is 2 1.
*/

public class Question18 {
    public static String getMinNumberForPattern(String pattern) {
        StringBuilder sb = new StringBuilder();
        Stack<Integer> st = new Stack<>();
        int num = 1;

        // Push numbers and flush stack when we hit an 'I' or end of pattern
        for(int i = 0; i <= pattern.length(); i++){
            st.push(num++);
            if(i == pattern.length() || pattern.charAt(i) == 'I'){
                while(!st.isEmpty()){
                    sb.append(st.pop());
                }
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            @SuppressWarnings("unused")
            int n = sc.nextInt();
            sc.nextLine();
            String[] patterns = sc.nextLine().trim().split("\\s+");
            for(String pattern : patterns){
                System.out.println(getMinNumberForPattern(pattern));
            }
        }
    }
}