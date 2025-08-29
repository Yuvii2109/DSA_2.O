/*
    Take an input str, a string. A “twin” is defined as two instances of a char separated by a char. E.g. "AxA" the A's make a “twin”. “twins” can overlap, so "AxAxA" contains 3 “twins” - 2 for A and 1 for x. Write a function which recursively counts number of “twins” in a string. Print the value returned.

    Input Format - Enter the string
    Constraints - None
    Output Format - Display the number of twins
    Sample Input - AXAXA
    Sample Output - 3
*/

import java.util.Scanner;

public class Question15 {
    private static int countEven(String str, int index, int count){
        if(index + 2 >= str.length()){
            return count;
        }
        if(str.charAt(index) == str.charAt(index + 2)){
            return countEven(str, index + 2, count + 1);
        }else{
            return countEven(str, index + 2, count);
        }
    }
    private static int countOdd(String str, int index, int count){
        if(index + 2 >= str.length()){
            return count;
        }
        if(str.charAt(index) == str.charAt(index + 2)){
            return countOdd(str, index + 2, count + 1);
        }else{
            return countOdd(str, index + 2, count);
        }
    }
    public static void main(String args[]) {
        try(Scanner sc = new Scanner(System.in)){
            String str = sc.nextLine();
            int odd = countOdd(str, 0, 0);
            int even = countEven(str, 1, 0);
            System.out.print(odd + even);
        }
    }
}