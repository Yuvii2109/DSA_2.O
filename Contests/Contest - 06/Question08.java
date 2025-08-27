/*
    Replace all occurrences of pi with 3.14

    Input Format - Integer N, no of lines with one string per line
    Constraints - 
        0 < N < 1000
        0 <= len(str) < 1000
    Output Format - Output result one per line
    Sample Input - 
        3
        xpix
        xabpixx3.15x
        xpipippixx
    Sample Output - 
        x3.14x
        xab3.14xx3.15x
        x3.143.14p3.14xx
    Explanation - All occurrences of pi have been replaced with "3.14".
*/

import java.util.Scanner;

public class Question08 {
    private static void replacePi(String s, int i, StringBuilder sb){
        if(i >= s.length()){
            System.out.println(sb);
            return;
        }
        if(i <= s.length() - 2 && s.charAt(i) == 'p' && s.charAt(i + 1) == 'i'){
            sb.append(3.14);
            replacePi(s, i + 2, sb);
        }else{
            sb.append(s.charAt(i));
            replacePi(s, i + 1, sb);
        }
    }
    public static void main(String args[]) {
        try(Scanner sc = new Scanner(System.in)){
            int T = sc.nextInt();
            while(T-- >= 0){
                String s = sc.nextLine();
                StringBuilder sb = new StringBuilder("");
                replacePi(s, 0, sb);
            }
        }
    }
}