/*
    Take as input str, a number in form of a string. Write a recursive function to convert the number in string form to number in integer form. E.g. for “1234” return 1234. Print the value returned.

    Input Format - Enter a number in form of a String
    Constraints - 1 <= Length of String <= 10
    Output Format - Print the number after converting it into integer
    Sample Input - 1234
    Sample Output - 1234
    Explanation - Convert the string to int. Do not use any inbuilt functions.
*/

import java.util.Scanner;

public class Question18 {
    private static void convertToInt(String str, int i, int num){
        if(i == str.length()){
            System.out.println(num);
            return;
        }
        num += (str.charAt(i) - '0') * Math.pow(10, (str.length() - i - 1));
        convertToInt(str, i + 1, num);
    }
    public static void main(String args[]) {
        try(Scanner sc = new Scanner(System.in)){
            String str = sc.nextLine();
            convertToInt(str, 0, 0);
        }
    }
}