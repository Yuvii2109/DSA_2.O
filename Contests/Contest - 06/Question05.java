/*
    Take as input N, a number. N is the size of a snakes and ladder board (without any snakes and ladders). Take as input M, a number. M is the number of faces of the dice.
        a. Write a recursive function which returns the count of different ways the board can be traveled using the dice. Print the value returned.
        b. Write a recursive function which prints dice-values for all valid paths across the board (void is the return type for function).

    Input Format - Enter a number N (size of the board) and number M(number of the faces of a dice)
    Constraints - 
        M <= 100
        N <= 100
        M^N <= 10^9
    Output Format - Display the number of paths and print all the paths in a space separated manner
    Sample Input - 
        3
        3
    Sample Output -
        111 12 21 3 
        4
*/

import java.util.Scanner;

public class Question05 {
    private static int numberOfPaths(int sum, int board, int dice){
        if(sum == board) return 1;
        if(sum > board) return 0;
        int total = 0;
        for(int face = 1; face <= dice; face++){
            total += numberOfPaths(sum + face, board, dice);
        }
        return total;
    }
    private static void printPaths(int sum, int board, int dice, String path){
        if(sum == board){
            System.out.print(path + " ");
            return;
        }
        if(sum > board){
            return;
        }
        for(int face = 1; face <= dice; face++){
            printPaths(sum + face, board, dice, path + face);
        }
    }
    public static void main(String args[]) {
        try(Scanner sc = new Scanner(System.in)){
            int N = sc.nextInt(); // Dimension of board
            int M = sc.nextInt(); // Faces of dice
            if(N == 0){
                System.out.println();
                System.out.println(1);
                return; // Do nothing man... 5 star khao
            }
            printPaths(0, N, M, "");
            System.out.println();
            System.out.println(numberOfPaths(0, N, M));
        }
    }
}