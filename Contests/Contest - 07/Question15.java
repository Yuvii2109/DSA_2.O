import java.util.Scanner;
import java.util.Stack;

/*
    Kartik Bhaiya, mentor at Coding Blocks, organized a party for their interns at Coding Blocks. In a party of N people, only one person is known to everyone. Such a person may be present in the party, if yes, she/he doesn’t know anyone in the party. We can only ask questions like “does A know B? “.
    Find the stranger (celebrity) in minimum number of questions.

    Input Format - First line contains N, number of persons in party. Next line contains the matrix of N x N which represents A knows B when it's value is one.
    Constraints - None 
    Output Format - Print the celebrity ID which is between 0 and N-1. If celebrity is not present then print "No Celebrity".
    Sample Input - 
        4
        0 0 1 0
        0 0 1 0
        0 0 0 0
        0 0 1 0
    Sample Output - 2
    Explanation - In the given case there are 4 persons in the party let them as A, B, C, D. The matrix represents A knows B when it's value is one. From the matrix, A knows C, B knows C and D knows C. Thus C is the celebrity who doesnot know anyone and it's ID is 2. Hence output is 2.
*/

public class Question15 {
    public static int findCelebrity(int[][] matrix, int n) {
        Stack<Integer> stack = new Stack<>();

        // Push all persons onto the stack
        for(int i = 0; i < n; i++){
            stack.push(i);
        }

        // Find the potential celebrity
        while(stack.size() > 1){
            int a = stack.pop();
            int b = stack.pop();

            if(matrix[a][b] == 1){
                // a knows b, so a cannot be celebrity
                stack.push(b);
            }else{
                // a does not know b, so b cannot be celebrity
                stack.push(a);
            }
        }

        // If no potential celebrity
        if(stack.isEmpty()){
            return -1;
        }

        int celeb = stack.pop();

        // Verify if the potential celebrity is actually a celebrity
        for(int i = 0; i < n; i++){
            if(i != celeb){
                if(matrix[celeb][i] == 1 || matrix[i][celeb] == 0){
                    return -1;
                }
            }
        }

        return celeb;
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            int[][] matrix = new int[n][n];
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    matrix[i][j] = sc.nextInt();
                }
            }
            int celeb = findCelebrity(matrix, n);
            if(celeb == -1){
                System.out.println("No Celebrity");
            }else{
                System.out.println(celeb);
            }
        }
    }
}