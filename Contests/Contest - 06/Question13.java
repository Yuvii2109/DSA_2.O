/*
    Take as input str, a string. a.Write a recursive function which counts the number of times ‘hi’ appears in the string. Print the value returned. b.Write a recursive function which removes all ‘hi’ in the string. Print the value returned. c.Write a recursive function which replaces all ‘hi’ in the string with ‘bye’. Print the value returned.

    Input Format - Enter a string
    Constraints - None
    Output Format - Display the no. of 'hi', string without 'hi' , string in which 'hi' is replaced with 'bye'
    Sample Input - abchibi
    Sample Output - 
        1
        abcbi
        abcbyebi
*/

import java.util.Scanner;

public class Question13 {
    private static void replaceHiByBye(String str, int index, StringBuilder sb){
        if(index >= str.length()){
            System.out.println(sb);
            return;
        }
        if(index == str.length() - 1){
            sb.append(str.charAt(index));
            System.out.println(sb);
            return;
        }
        if(str.charAt(index) == 'h' && str.charAt(index + 1) == 'i'){
            sb.append("bye");
            replaceHiByBye(str, index + 2, sb);
        }else{
            sb.append(str.charAt(index));
            replaceHiByBye(str, index + 1, sb);
        }
    }
    private static void removeHi(String str, int index, StringBuilder sb){
        if(index >= str.length()){
            System.out.println(sb);
            return;
        }
        if(index == str.length() - 1){ 
            sb.append(str.charAt(index));
            System.out.println(sb.toString());
            return;
        }
        if(str.charAt(index) == 'h' && str.charAt(index + 1) == 'i'){
            removeHi(str, index + 2, sb);
        }else{
            sb.append(str.charAt(index));
            removeHi(str, index + 1, sb);
        }
    }
    private static int count = 0;
    private static void countHi(String str, int index){
        if(index >= str.length() - 1){
            System.out.println(count);
            return;
        }
        if(str.charAt(index) == 'h' && str.charAt(index + 1) == 'i'){
            count++;
            countHi(str, index + 2);
        }else{
            countHi(str, index + 1);
        }
    }
    public static void main(String args[]) {
        try(Scanner sc = new Scanner(System.in)){
            String str = sc.nextLine();
            count = 0;
            countHi(str, 0);
            removeHi(str, 0, new StringBuilder());
            replaceHiByBye(str, 0, new StringBuilder());
        }
    }
}