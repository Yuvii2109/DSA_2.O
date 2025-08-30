/*
    Take as input str, a string. str represents keys pressed on a nokia phone keypad. We are concerned with all possible words that can be written with the pressed keys.

    Assume the following alphabets on the keys - 1 -> abc , 2 -> def , 3 -> ghi , 4 -> jkl , 5 -> mno , 6 -> pqrs , 7 -> tuv , 8 -> wx , 9 -> yz

    E.g. “12” can produce following words “ad”, “ae”, “af”, “bd”, “be”, “bf”, “cd”, “ce”, “cf”
        a. Write a recursive function which returns the count of words for a given keypad string. Print the value returned.
        b.Write a recursive function which prints all possible words for a given keypad string (void is the return type for function).

    Input Format - Single line input containing a single integer.
    Constraints - 1 <= Length of string <= 10^3
    Output Format - Print all the words in a space separated manner. Also print the count of these numbers in next line.
    Sample Input - 12
    Sample Output -
        ad ae af bd be bf cd ce cf
        9
    Explanation - 
        1 can correspond to 'a', 'b' or 'c' .
        2 can correspond to 'd', 'e' or 'f'.
        We print all combinations of these
*/

import java.util.Scanner;

public class Question19 {
    private static String[] KEYPAD = {
        "abc", // 1
        "def", // 2
        "ghi", // 3
        "jkl", // 4
        "mno", // 5
        "pqrs", // 6
        "tuv", // 7
        "wx", // 8
        "yz" // 9
    };
    private static void printAll(String s, int index, StringBuilder current){
        if(index == s.length()){
            System.out.print(current + " ");
            return;
        }
        char ch = s.charAt(index);
        if(ch < '1' || ch > '9'){
            return;
        }
        String letters = KEYPAD[ch - '1'];
        for(int i = 0; i < letters.length(); i++){
            current.append(letters.charAt(i));
            printAll(s, index + 1, current);
            current.deleteCharAt(current.length() - 1);
        }
    }
    private static long countCombinations(String s, int index){
        if(index == s.length()){
            return 1;
        }
        char ch = s.charAt(index);
        if(ch < '1' || ch > '9') return 0;
        String letters = KEYPAD[ch - '1'];
        return letters.length() * countCombinations(s, index + 1);
    }
    public static void main(String args[]) {
        try(Scanner sc = new Scanner(System.in)){
            String str = sc.nextLine();
            printAll(str, 0, new StringBuilder());
            System.out.println();
            long count = countCombinations(str, 0);
            System.out.println(count);
        }
    }
}