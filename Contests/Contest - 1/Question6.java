import java.util.Scanner;

public class Question6 {
    public static void main(String args[]) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the number of rows - ");
            int n = sc.nextInt();
            n = 2*n-1;
            int rows = 1;
            int centralNumber = 1;
            int numberOfSpaces = n/2;
            while(rows <= n){
                int x = 1, y;
                if(rows < (n+1)/2){
                    y = rows;
                }else{
                    y = n-rows+1;
                }
                while(x <= numberOfSpaces){
                    System.out.print("  ");
                    x++;
                }
                int tempY = y;
                while(tempY <= centralNumber){
                    System.out.print(tempY + " ");
                    tempY++;
                }
                int k = centralNumber - 1;
                while(k >= y){
                    System.out.print(k + " ");
                    k--;
                }
                if(rows < (n+1)/2){
                    numberOfSpaces--;
                    centralNumber += 2;
                }else{
                    numberOfSpaces++;
                    centralNumber -= 2;
                }
                System.out.println();
                rows++;
            }
        }
    }
}