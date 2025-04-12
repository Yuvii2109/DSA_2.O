import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the number of elements - ");
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i = 0; i < n; i++){
                System.out.print("Enter the element " + (i+1) + " - ");
                arr[i] = sc.nextInt();
            }
            int sum = 0;
            int start = 0, end = n-1;
            while(start <= end){
                if(start != end){
                    sum += arr[start] + arr[end];
                }else{
                    sum += arr[start];
                }
                start++; 
                end--;
            }
            System.out.println("Sum of elements of array - " + sum);
        }
    }
}