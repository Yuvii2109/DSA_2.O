/*
    Take as input S, a string. Write a function that toggles the case of all characters in the string. Print the value returned.

    Input Format - String
    Constraints - Length of string should be between 1 to 1000.
    Output Format - String
    Sample Input - abC
    Sample Output - ABc
    Explanation - Toggle Case means to change UpperCase character to LowerCase character and vice-versa.
*/

import java.util.Scanner;

public class Question02 {
    public static void toggleString(String str){
        StringBuilder s = new StringBuilder("");
        for(char ch : str.toCharArray()){
            if(Character.isLowerCase(ch)){
                char c = (char)(ch - 32);
                s.append(c);
            }else{
                char c = (char)(ch + 32);
                s.append(c);
            }
        }
        String res = s.toString();
        System.out.println(res);
    }
    public static void main(String args[]) {
        // Your Code Here
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the string - ");
            String str = sc.nextLine();
            toggleString(str);
        }
    }
}