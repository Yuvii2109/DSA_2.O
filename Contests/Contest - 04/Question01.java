/*
    One of the important aspect of object oriented programming is readability of the code. To enhance the readability of code, developers write function and variable names in Camel Case. You are given a string, S, written in Camel Case. FindAllTheWordsContainedInIt.

    Input Format - A single line contains the string.
    Constraints - |S|<= 1000
    Output Format - Print words present in the string, in the order in which it appears in the string.
    Sample Input - "IAmACompetitiveProgrammer"
    Sample Output - 
        I
        Am
        A
        Competitive
        Programmer
    Explanation - There are 5 words in the string.
*/

import java.util.Scanner;

public class Question01 {
    public static void tokenize2(String str){
        int i = 0, j = 0;
        while(i < str.length() && j < str.length()){
            if(str.charAt(j) >= 'a' && str.charAt(j) <= 'z'){
                j++;
            }else{
                System.out.println(str.substring(i, j));
                i = j;
                j++;
            }
        }
        System.out.println(str.substring(i, j));
    }
    public static void tokenize(String str){
        for(int i = 0; i < str.length() - 1; i++){
            char next = str.charAt(i + 1);
            char current = str.charAt(i);
            if(next >= 'A' && next <= 'Z'){
                System.out.println(current);
            }else{
                System.out.print(current);
            }
        }
        System.out.print(str.charAt(str.length() - 1));
    }
    public static void main(String args[]) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the string - ");
            String str = sc.nextLine();
            tokenize2(str);
        }
    }
}