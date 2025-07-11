/*
    Given a string, find the first non-repeating character in it. For example, if the input string is “coding blocks”, then the output should be ‘d’ and if the input string is “coding”, then the output should be ‘c’.

    Input Format - The first line contains T denoting the number of testcases. The following T lines contain the string S.
    Constraints - String Length <100000
    Output Format - For each testcase, print the first non repeating character present in string. Print -1 if there is no non repeating character.
    Sample Input - 
        4
        codingblocks
        abbac
        java
        ccdd
    Sample Output - 
        d
        c
        j
        -1
*/

import java.util.Scanner;

public class Question07 {
    public static void firstNonRepeating(String str){
        int[] freq = new int[26];
        for(char ch : str.toCharArray()){
            freq[ch - 'a']++;
        }
        for(char ch : str.toCharArray()){
            if(freq[ch - 'a'] == 1){
                System.out.println(ch);
                return;
            }
        }
        System.out.println(-1);
    }
    public static void main(String args[]) {
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            sc.nextLine();
            // sc.nextLine() (immediately afterwards) consumes that leftover newline, so the buffer is positioned at the start of your first real string.
            for(int i = 0; i < n; i++){
                String str = sc.nextLine();
                firstNonRepeating(str);
            }
        }
    }
}