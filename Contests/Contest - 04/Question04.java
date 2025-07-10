/*
    Take as input S, a string. Write a function that does basic string compression. Print the value returned. E.g. for input “aaabbccds” print out a3b2c2ds.


    Input Format - A single String S.
    Constraints - A string of length between 1 to 1000
    Output Format - The compressed String.
    Sample Input - aaabbccds
    Sample Output - a3b2c2ds
    Explanation - In the given sample test case 'a' is repeated 3 times consecutively, 'b' is repeated twice, 'c' is repeated twice. But, 'd' and 's' occurred only once that's why we do not write their occurrence.
*/

import java.util.Scanner;

public class Question04 {
    public static void freqTransform(String str){
        int n = str.length();
        int count = 1;
        for(int i = 0; i < n - 1; i++){
            char chCurr = str.charAt(i);
            char chNext = str.charAt(i + 1);
            if(chCurr == chNext){
                count++;
            }else{
                System.out.print(chCurr);
                if(count == 1){
                    continue;
                }else{
                    System.out.print(count);
                }
                count = 1;
            }
        }
        System.out.print(str.charAt(n - 1));
        if (count > 1) {
            System.out.print(count);
        }
    }
    public static void main(String args[]) {
        try(Scanner sc = new Scanner(System.in)){
            String str = sc.nextLine();
            freqTransform(str);
        }
    }
}