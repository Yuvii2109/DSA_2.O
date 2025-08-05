/*
    Take as input N, a number. Print odd numbers in decreasing sequence (up until 0) and even numbers in increasing sequence (up until N) using Recursion

    Constraints - 1 <= N <=1000

    Sample Input - 5
    Sample Output - 
        5
        3
        1
        2
        4
*/

import java.util.Scanner;

public class Question01 {
    public static void printEven(int n, int i){
        if(i > n){
            return;
        }
        System.out.println(i);
        printEven(n, i + 2);
    }
    public static void printOdd(int n, int i){
        if(i <= 0){
            return;
        }
        System.out.println(i);
        printOdd(n, i - 2);
    }
    public static void printOddEven(int n){
        if(n % 2 == 0){
            printOdd(n, n - 1);
        }else{
            printOdd(n, n);
        }
        printEven(n, 2);
    }
    public static void main(String args[]) {
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            printOddEven(n);
        }
    }
} 