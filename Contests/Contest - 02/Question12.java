/*
    Given a integer as a input and replace all the '0' with '5' in the integer

    Input Format - Enter an integer n
    Constraints - 0<=n<=1000000000000
    Output Format - All zeroes are replaced with 5
        Sample Input - 102
        Sample Output - 152
        Explanation - Check each digit , if it is nonzero, then no change required but if it is zero then replace it by 5.
*/

import java.util.Scanner;

public class Question12 {
    public static void main(String args[]) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the number - ");
            long n = sc.nextLong();
            long temp = n;
            long placevalue = 1;
            long replaced = 0;
            if(temp == 0){
                System.out.println(5);
                return;
            }
            while(temp != 0){
                long rem = temp%10;
                if(rem == 0){
                    replaced += 5*placevalue;
                }else{
                    replaced += rem*placevalue;
                }
                temp /= 10;
                placevalue *= 10;
            }
            System.out.println(n + " after all 0s get replaced by 5 - " + replaced);
        }
    }
}