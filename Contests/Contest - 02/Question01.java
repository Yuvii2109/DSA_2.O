/*
    Take N as input. Print the sum of its odd placed digits and sum of its even placed digits. 
    
    Input Format - 
        Constraints - 0 < N <= 1000000000

    Output Format - 
        Sample Input - 2635
        Sample Output - 
            11
            5
        Explanation - 5 is present at 1st position, 3 is present at 2nd position, 6 is present at 3rd position and 2 is present at 4th position. Sum of odd placed digits on first line. 5 and 6 are placed at odd position. Hence odd place sum is 5+6=11. Sum of even placed digits on second line. 3 and 2 are placed at even position. Hence even place sum is 3+2=5
*/

import java.util.Scanner;

public class Question01 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter a number - ");
            int n = sc.nextInt();
            int i = 1;
            int evenSum = 0, oddSum = 0;
            while(n != 0){
                int rem = n%10;
                if(i%2 == 0){
                    evenSum += rem;
                }else{
                    oddSum += rem;
                }
                i++;
                n /= 10;
            }
            System.out.println("Sum of odd placed digits - " + oddSum);
            System.out.println("Sum of even placed digits - " + evenSum);
        }
    }
}