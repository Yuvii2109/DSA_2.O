/*
    Given a string S, the task is to identify the character that appears most frequently. It is guaranteed that only one character has the highest frequency.

    Input Format - A single string S (1 ≤ |S| ≤ 100), consisting of lowercase and uppercase English letters.
    Constraints - A string of length between 1 to 100.
    Output Format - A single character that appears most frequently in the given string.
    Sample Input - aaabacB
    Sample Output - a
    Explanation - Frequency of each character in the string:
        'a' → 4 times
        'b' → 2 times
        'c' → 1 time
        'B' → 1 time
    Note - Since 'B' (uppercase) is different from 'b' (lowercase), they are counted separately. The character with the highest frequency is 'a' (appearing 4 times).
*/

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Question06 {
    public static void printMax(String str){
        Map<Character, Integer> map = new HashMap<>();
        for(char ch : str.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        char maxChar = 'k';
        int maxCount = 0;
        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            if(entry.getValue() > maxCount){
                maxChar = entry.getKey();
                maxCount = entry.getValue();
            }
        }
        System.out.print(maxChar);
    }
    public static void main(String args[]) {
        // Your Code Here
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the String - ");
            String str = sc.nextLine();
            printMax(str);
        }
    }
}