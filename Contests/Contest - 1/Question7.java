import java.util.Scanner;

public class Question7 {
    public static void main(String args[]) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the number of rows - ");
            int n = sc.nextInt();
            int rows = 1;
            int numberOfNumbers = 1;
            while(rows <= n){
                for(int i = 1; i <= numberOfNumbers; i++){
                    if(i == 1 || i == numberOfNumbers){
                        System.out.print(numberOfNumbers + "\t");
                    }else{
                        System.out.print("0\t");
                    }
                }
                numberOfNumbers++;
                System.out.println();
                rows++;
            }
        }
    }
}