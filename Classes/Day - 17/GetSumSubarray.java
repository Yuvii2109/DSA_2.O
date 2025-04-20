import java.util.Scanner;

public class GetSumSubarray {
    public static int getSum(int arr[], int l, int r){
        if(l < 0 || r >= arr.length){
            return 0;
        }
        int sum = 0;
        if(l <= r){
            for(int i = l; i <= r; i++){
                sum += arr[i];
            }
        }else{
            sum = 0;
        }
        return sum;
    }
    public static int getSumWithoutLooping(int subsum[], int l, int r){
        if(l < 0 || r >= subsum.length){
            return 0;
        }
        if(l == 0 && r == 0){
            return subsum[0];
        }
        int sum = 0;
        if(l <= r){
            sum = subsum[r] - subsum[l-1];
        }else{
            sum = 0;
        }
        return sum;
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int[] arr = {1, 2, 3, 4, 5, 6, 7};
            int subsum[] = new int[arr.length];
            subsum[0] = arr[0];
            for(int i = 1; i < arr.length; i++){
                subsum[i] = subsum[i-1] + arr[i];
            }
            System.out.print("Enter the number of queries - ");
            int q = sc.nextInt();
            while(q-- > 0){
                System.out.print("Enter the start - ");
                int left = sc.nextInt();
                System.out.print("Enter the end - ");
                int right = sc.nextInt();
                int sum = getSumWithoutLooping(subsum, left, right);
                if(sum == 0){
                    System.out.println("Thappad maar doonga nalayak");
                }else{
                    System.out.println("Sum from " + left + " to " + right + " - " + sum);
                }
            }
        }
    }
}