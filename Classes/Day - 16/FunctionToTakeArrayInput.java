import java.util.Scanner;

public class FunctionToTakeArrayInput {
    public static int[] buildArray(int n){
        try(Scanner sc = new Scanner(System.in)){
            int arr[] = new int[n];
            for(int i = 0; i < n; i++){
                System.out.print("Enter element " + (i+1) + " - ");
                arr[i] = sc.nextInt();
            }
            return arr;
        }
    }
    public static void displayArray(int[] arr){
        System.out.print("Array formed is - [ ");
        for(int a : arr){
            System.out.print(a + " ");
        }
        System.out.print("]");
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the number of elements in array - ");
            int n = sc.nextInt();
            int[] arr = buildArray(n);
            displayArray(arr);
        }
    }
}