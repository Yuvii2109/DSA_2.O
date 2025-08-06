/*
    Take as input N, a number. Write a recursive function to find Nth triangle where 1st triangle is 1, 2nd triangle is 1 + 2 = 3, 3rd triangle is 1 + 2 + 3 = 6, so on and so forth. Print the value returned.

    Input Format - Integer N is the single line of input.
    Constraints - 1 <= N <= 100
    Output Format - Print the output as a single integer which is the nth triangle.
    Sample Input - 3
    Sample Output - 6
*/

import java.util.Scanner;

public class Question02 {
    public static void calculation(int n, int i, int result){
        if(i > n){
            System.out.println(result);
            return;
        }
        int newResult = result + i;
        int index = i + 1;
        calculation(n, index, newResult);
    }
    public static void printNthTriangle(int n){
        int nthTriangle = 0;
        calculation(n, 1, nthTriangle);
    }
    public static void main(String args[]) {
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            printNthTriangle(n);
        }
    }
}