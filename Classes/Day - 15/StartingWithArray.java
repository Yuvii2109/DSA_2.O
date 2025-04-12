import java.util.Scanner;

public class StartingWithArray {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the number of elements you wish to enter in the array - ");
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i = 0; i < n; i++){
                System.out.print("Enter element " + (i+1) + " - ");
                arr[i] = sc.nextInt();
            }
            System.out.println("You have entered the following elements in the array - ");
            for(int i = 0; i < n; i++){
                System.out.print(arr[i] + " ");
            }
        }
    }
}