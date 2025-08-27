/*
    Given an integer N, now you have to convert all zeros of N to 5.

    Input Format - The first Line takes input integer N, denoting the number.
    Constraints - 1 <= N <= 10000
    Output Format - Print the number after replacing all 0's with 5.
    Sample Input - 103
    Sample Output - 153
    Explanation - 
        Testcase 1 - after replacing 0 with 5 ,number will become 153.
        Testcase 2 - there is no zero in number so it will remain same.
*/

import java.util.Scanner;

public class Question09 {
    private static void convert0To5(String str, int i, StringBuilder sb){
        if(i == str.length()){
            System.out.println(sb);
            return;
        }
        if(str.charAt(i) == '0'){
            sb.append(5);
            convert0To5(str, i + 1, sb);
        }else{
            sb.append(str.charAt(i));
            convert0To5(str, i + 1, sb);
        }
    }
    public static void main (String args[]) {
        try(Scanner sc = new Scanner(System.in)){
            String str = "";
            int n = sc.nextInt();
            str = str + n;
            StringBuilder sb = new StringBuilder("");
            convert0To5(str, 0, sb);
        }
    }
}