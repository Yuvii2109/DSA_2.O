/*
    Given a String S, reverse the string without reversing its individual words. Words are separated by dots.

    Input Format - You have to take input for the String.
    Constraints - length of the string is less than 10^5.
    Output Format - You have to return the String.
    Sample Input - i.like.this.program.very.much
    Sample Output - much.very.program.this.like.i
    Explanation - After reversing the whole string(not individual words), the input string becomes much.very.program.this.like.i
*/

import java.util.Scanner;

public class Question10 {
    public static void reverse(String str){
        int n = str.length();
        int i = str.length() - 1, j = i;
        StringBuilder sb = new StringBuilder();
        while(i >= 0){
            while(i >= 0 && str.charAt(i) != '.'){
                i--;
            }
            sb.append(str.substring(i + 1, j + 1)).append('.');
            while(i >= 0 && str.charAt(i) == '.'){
                i--;
            }
            j = i;
        }
        String res = sb.toString();
        System.out.print(res.substring(0, n));
    }
    public static void main (String args[]) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the string - ");
            String str = sc.nextLine();
            reverse(str);
        }
    }
}