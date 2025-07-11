/*
    Take as input S, a string. Write a program that inserts between each pair of characters the difference between their ascii codes and print the ans.

    Input Format - String
    Constraints - Length of String should be between 2 to 1000.
    Output Format - String
    Sample Input - acb
    Sample Output - a2c-1b
    Explanation - For the sample case, the Ascii code of a=97 and c=99 ,the difference between c and a is 2.Similarly ,the Ascii code of b=98 and c=99 and their difference is -1. So the ans is a2c-1b.
*/

import java.util.Scanner;

public class Question05 {
    public static void asciiDiffTransform(String str){
        int n = str.length();
        for(int i = 0; i < n - 1; i++){
            char curr = str.charAt(i);
            char next = str.charAt(i + 1);
            int difference = next - curr;
            System.out.print(curr);
            System.out.print(difference);
        }
        System.out.print(str.charAt(n - 1));
    }
    public static void main(String args[]) {
        // Your Code Here
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the string - ");
            String str = sc.nextLine();
            asciiDiffTransform(str);
        }
    }
}