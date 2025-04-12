import java.util.Scanner;

public class PrintNNaturalNumbers {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of natural numbers you want to print - ");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            System.out.println(i+1);
        }
        sc.close();
    }
}