/*
    Take as input S, a string. Write a function that removes all consecutive duplicates. Print the value returned.

    Input Format - String
    Constraints - A string of length between 1 to 1000
    Output Format - String
    Sample Input - aabccba
    Sample Output - abcba
    Explanation - For the given example, "aabccba", Consecutive Occurrence of a is 2, b is 1, and c is 2. After removing all of the consecutive occurences, the Final ans will be : - "abcba".
*/

import java.util.Scanner;

public class Question09 {
    public static void removeConsecutiveDuplicates(String str){
        int n = str.length();
        StringBuilder sb = new StringBuilder();
        int i = 0, j = 0;
        while(i < n && j < n){
            if(i == j){
                sb.append(str.charAt(i));
                j++;
            }else if(str.charAt(i) == str.charAt(j) && j < n){
                j++;
            }else{
                i = j;
            }
        }
        System.out.println(sb);
    }
    public static void main(String args[]) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the String - ");
            String str = sc.nextLine();
            removeConsecutiveDuplicates(str);
        }
    }
}