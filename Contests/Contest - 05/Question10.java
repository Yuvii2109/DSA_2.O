/*
    Pragya and Pranjal are sisters, and they love to watch reels and YouTube shorts the whole day on their mobile phones. One blue day their mummy scolded them and threw their phones into the fire. They were getting bored after this incident because nothing exciting was happening in their lives. Their mummy motivated them to learn a programming language, and due to her highly motivational speech, Pragya and Pranjal picked up a coding question. The task is to print true if elements of the square matrix make the lower triangular, otherwise print false.
    However, they don't know any programming language but you do. Now it's your task to write code for this problem.
    
    Input Format - First line contains N, size of the matrix Next N lines contains N integers each denoting the matrix elements.
    Constraints - 4 <= N <= 100
    Output Format - Print "true" or "false" (without the quotes).
    Sample Input - 
        4
        374 0 0 0 
        761 60 0 0 
        578 531 878 0 
        75 10 197 198 
    Sample Output - true
    Explanation - A Lower Triangular Matrix is a square matrix where all elements above the main diagonal are zero. The elements on and below the diagonal can have any value.
*/

import java.util.Scanner;

public class Question10 {
    public static boolean check(int[][] arr){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                if(arr[i][j] != 0){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main (String args[]) {
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            int arr[][] = new int[n][n];
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    arr[i][j] = sc.nextInt();
                }
            }
            boolean result = check(arr);
            System.out.println(result);
        }
    }
}