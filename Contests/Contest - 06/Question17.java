/*
    Given an integer 'n'. Print all the possible pairs of 'n' balanced parentheses.
    The output strings should be printed in the sorted order considering '(' has higher value than ')'.

    Input Format - Single line containing an integral value 'n'.
    Constraints - 1 <= n <= 11
    Output Format - Print the balanced parentheses strings with every possible solution on new line.
    Sample Input - 2
    Sample Output - 
        ()() 
        (())
*/

import java.util.Scanner;

public class Question17 {
    public static void printBalancedParentheses(int opening, int closing, String str){
        if(opening == 0 && closing == 0){
            System.out.println(str);
            return;
        }
        if(closing > opening){
            printBalancedParentheses(opening, closing - 1, str + ")");
        }
        if(opening > 0){
            printBalancedParentheses(opening - 1, closing, str + "(");
        }
    }
    public static void main(String args[]) {
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            printBalancedParentheses(n, n, "");
        }
    }
}