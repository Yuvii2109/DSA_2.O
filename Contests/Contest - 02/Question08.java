/*
    Take N (number in binary format). Write a function that converts it to decimal format and Print the value returned. 

    Input Format - Constraints - 0 < N <= 1000000000
    Output Format - 
        Sample Input - 101010
        Sample Output - 42
        Explanation - For binary number fedcba , Decimal number = f * 2^5 + e * 2^4 + d * 2^3 + …..+ a * 2^0.
*/

import java.util.Scanner;

public class Question08 {
    public static void main(String args[]) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter a binary number - ");
            int n = sc.nextInt();
            int decimal = 0;
            int placevalue = 1;
            int temp = n;
            while(temp != 0){
                int rem = temp%10;
                decimal += rem*placevalue;
                placevalue *= 2;
                temp /= 10;
            }
            System.out.println(n + " -> " + decimal);
        }
    }
}