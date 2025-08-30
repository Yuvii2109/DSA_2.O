/*
    Take as input str, a string. We are concerned with all the possible subsequences of str. E.g.
        a. Write a recursive function which returns the count of subsequences for a given string. Print the value returned.
        b. Write a recursive function which prints all possible subsequences for a “abcd” has following subsequences “”, “d”, “c”, “cd”, “b”, “bd”, “bc”, “bcd”, “a”, “ad”, “ac”, “acd”, “ab”, “abd”, “abc”, “abcd”.given string (void is the return type for function).
    Note - Use cin for input for C++
    Input Format - Enter a string
    Constraints - None
    Output Format - Print all the subsequences in a space separated manner and isplay the total no. of subsequences.
    Sample Input - abcd
    Sample Output - 
        d c cd b bd bc bcd a ad ac acd ab abd abc abcd 
        16
    Explanation - Print all possible subsequences of the given string.
*/

import java.util.Scanner;

public class Question20 {
    private static void printAll(String s, int index, String current){
        if(index == s.length()){
            System.out.print(current + " ");
            return;
        }
        char ch = s.charAt(index);
        printAll(s, index + 1, current);
        printAll(s, index + 1, current + ch);
    }
    public static void main(String args[]) {
        try(Scanner sc = new Scanner(System.in)){
            String str = sc.next();
            printAll(str, 0, "");
            System.out.println("\n" + (int)Math.pow(2, str.length()));
        }
    }
}