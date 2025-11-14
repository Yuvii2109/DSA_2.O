
import java.util.Scanner;

/*
    In the compter lab, there are N tables. In each of the tables, either a student is seated or it is empty. The students will use computers to work on assignments. A student can use a computer if it is placed to his immediate left or to his immediate right.

    You are given the seating arrangement as a string s. If lab[i] == "S", there is a student seated. If lab[i] == ".", it is empty. Computers can be placed on the empty slots. Find the minimum number of computers that need to be allotted to the lab to serve all students or determine if it is impossible for all students to work on assignments. If it is impossible, print -1.

    Notes - 
        The computers can only be placed in empty tables.
        Two students can share one computer.
    Input Format - You are given a string s containing only 'S' and '.' denoting the seating arrangement.
    Constraints - 1 ≤ |s| ≤ 105
    Output Format - You need to output the minimum number of computers to serve all students. If it is impossible, print -1
    Sample Input - .S.S
    Sample Output - 1
    Explanation - You can put a computer at the third position so that both students can use it. The final state will be .SCS
*/

public class Question09 {
    @SuppressWarnings("UnnecessaryContinue")
    private static void minNumberOfComputers(String s){
        int n = s.length();
        char[] arr = s.toCharArray();
        int computers = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] == 'S'){
                if(i - 1 >= 0 && arr[i - 1] == 'C'){
                    continue;
                }else if(i + 1 < n && arr[i + 1] == '.'){
                    arr[i + 1] = 'C';
                    computers++;
                }else if(i - 1 >= 0 && arr[i - 1] == '.'){
                    arr[i - 1] = 'C';
                    computers++;
                }else{
                    System.out.println(-1);
                    return;
                }
            }
        }
        System.out.println(computers);
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            String s = sc.nextLine();
            minNumberOfComputers(s);
        }
    }
}