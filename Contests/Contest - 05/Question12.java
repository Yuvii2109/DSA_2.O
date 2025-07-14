/*
    Implement squareroot(x). Compute and return the square root of x.
    If x is not a perfect square, return floor(sqrt(x)). Note - DO NOT USE SQRT FUNCTION FROM STANDARD LIBRARY
    Input Format - An integer A.
    Constraints - 0 <= A <10000000000
    Output Format - Squareroot of A.
    Sample Input - 25
    Sample Output - 5
*/

import java.util.Scanner;

public class Question12 {
    public static int findSqRoot(float A){
        long lower = 0;
        long upper = (long)A;
        long ans = 0;
        while(lower <= upper){
            long mid = lower + (upper - lower) / 2;
            long square = (long)mid * mid;
            if(square == A){
                return (int)mid;
            }else if(square < A){
                ans = mid;
                lower = mid + 1;
            }else{
                upper = mid - 1;
            }
        }
        return (int)ans;
    }
    public static void main (String args[]) {
        try(Scanner sc = new Scanner(System.in)){
            float A = sc.nextFloat();
            int result = findSqRoot(A);
            System.out.println(result);
        }
    }
}