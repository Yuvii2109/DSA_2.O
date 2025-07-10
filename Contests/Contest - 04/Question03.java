/*
    Take as input S, a string. Write a function that replaces every even character with the character having just higher ASCII code and every odd character with the character having just lower ASCII code. Print the value returned.


    Input Format - String
    Constraints - Length of string should be between 1 to 1000.
    Output Format - String
    Sample Input - abcg
    Sample Output - badf
*/

import java.util.Scanner;

public class Question03 {
    public static void transform(String str){
        StringBuilder sb = new StringBuilder();
        int n = str.length();
        for(int i = 0; i < n; i++){
            char ch = str.charAt(i);
            if(i % 2 == 0){
                sb.append((char)(ch + 1));
            }else{
                sb.append((char)(ch - 1));
            }
        }
        String res = sb.toString();
        System.out.print(res);
    }
    public static void main(String args[]) {
        // Your Code Here
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the String - ");
            String str = sc.nextLine();
            transform(str);
        }
    }
}