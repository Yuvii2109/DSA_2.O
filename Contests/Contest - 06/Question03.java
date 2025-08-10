/*
    Take as input str, a string.

        a.) Write a recursive function which counts the number of times ‘hi’ appears in the string – but skip all such ‘hi’ which are followed by ‘t’ to form ‘hit’. Print the value returned.

        b.) Write a recursive function which removes all ‘hi’ in the string – but skip all such ‘hi’ which are followed by ‘t’ to form ‘hit’. Print the value returned.

        c.) Write a recursive function which replaces all ‘hi’ in the string with ‘bye’ – but skip all such ‘hi’ which are followed by ‘t’ to form ‘hit’. Print the value returned.


    Input Format - Enter the String
    Constraints - None

    Output Format - Display the total no.of ''hi'' (''hi'' should not be followed by a 't'), string in which all ''hi'' are removes(''hi'' should not be followed by a 't'), string in which all ''hi'' are replace by ''bye''(''hi'' should not be followed by a 't')

    Sample Input - abchihitfhi 
    Sample Output - 
        2
        abchitf
        abcbyehitfbye
*/

import java.util.Scanner;

public class Question03 {
    public static String printReplacedBye(String s){
        if(s.length() < 2){
            return s;
        }
        if(s.startsWith("hit")){
            return "hit" + printReplacedBye(s.substring(3));
        }
        if(s.startsWith("hi")){
            return "bye" + printReplacedBye(s.substring(2));
        }
        return s.charAt(0) + printReplacedBye(s.substring(1));
    }
    public static String printRemovedHi(String s){
        if(s.length() < 2){
            return s;
        }
        if(s.startsWith("hit")){
            return "hit" + printRemovedHi(s.substring(3));
        }
        if(s.startsWith("hi")){
            return printRemovedHi(s.substring(2));
        }
        return s.charAt(0) + printRemovedHi(s.substring(1));
    }
    public static int printCountHi(String s){
        if(s.length() < 2){
            return 0;
        }
        if(s.startsWith("hit")){
            return printCountHi(s.substring(3));
        }
        if(s.startsWith("hi")){
            return 1 + printCountHi(s.substring(2));
        }
        return printCountHi(s.substring(1));
    }
    public static void main(String args[]) {
        try(Scanner sc = new Scanner(System.in)){
            String s = sc.nextLine();
            System.out.println(printCountHi(s));
            System.out.println(printRemovedHi(s));
            System.out.println(printReplacedBye(s));
        }
    }
}