/*
    Given a binary number, help Von Neuman to find out its decimal representation. For eg 000111 in binary is 7 in decimal.
    Input Format - The first line contains N , the number of binary numbers. Next N lines contain N integers each representing binary represenation of number.
    Constraints - N <= 1000 Digits in binary representation is <= 16.
    Output Format - N lines,each containing a decimal equivalent of the binary number. 
    Sample Input - 
        4
        101
        1111
        00110
        111111
    Sample Output - 
        5
        15
        6
        63
    Explanation - For binary number fedcba , Decimal number = f * 25 + e * 24 + d * 23 + …..+ a * 20.
*/

import java.util.Scanner;

public class Question13 {
    public static void binaryToDecimal(long[] arr){
        for(int i = 0; i < arr.length; i++){
            long temp = arr[i];
            long decimal = 0;
            int placevalue = 1;
            while(temp != 0){
                long rem = temp%10;
                decimal += placevalue*rem;
                temp /= 10;
                placevalue *= 2;
            }
            System.out.println(decimal);
        }
    }
    public static void main(String args[]) {
        try(Scanner sc = new Scanner(System.in)){
            int T = sc.nextInt();
            long arr[] = new long[T];
            int i = 0;
            while(T-- > 0){
                arr[i] = sc.nextLong();
                i++;
            }
            binaryToDecimal(arr);
        }
    }
}