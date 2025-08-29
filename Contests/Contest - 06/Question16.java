/*
    Take as input N1 and N2, both numbers. N1 and N2 is the number of rows and columns on a rectangular board. Our player starts in top-left corner of the board and must reach bottom-right corner. In one move the player can move 1 step horizontally (right) or 1 step vertically (down).
        a. Write a recursive function which returns the count of different ways the player can travel across the board. Print the value returned.
        b. Write a recursive function which returns an ArrayList of moves for all valid paths across the board. Print the value returned.

    e.g. for a board of size 3,3; a few valid paths will be “HHVV”, “VVHH”, “VHHV” etc. c. Write a recursive function which prints moves for all valid paths across the board (void is the return type for function).
    Input Format - Enter the number of rows N and columns M
    Constraints - None
    Output Format - Display the total number of paths and display all the possible paths in a space separated manner
    Sample Input - 
        3
        3
    Sample Output - 
        VVHH VHVH VHHV HVVH HVHV HHVV
        6
*/

import java.util.Scanner;

public class Question16 {
    static int count = 0;
    private static void paths(int sourceRow, int sourceCol, int destRow, int destCol, String path){
        if(sourceRow > destRow || sourceCol > destCol){
            return;
        }
        if(sourceRow == destRow && sourceCol == destCol){
            System.out.print(path + " ");
            count++;
            return;
        }
        paths(sourceRow + 1, sourceCol, destRow, destCol, path + "V");
        paths(sourceRow, sourceCol + 1, destRow, destCol, path + "H");
    }
    public static void main(String args[]) {
        try(Scanner sc = new Scanner(System.in)){
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            count = 0;
            paths(0, 0, n1 - 1, n2 -1, "");
            System.out.println("\n" + count);
        }
    }
}