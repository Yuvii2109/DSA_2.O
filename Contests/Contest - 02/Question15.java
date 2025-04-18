/*
    Due to an immense rise in Pollution, Kejriwal is back with the Odd and Even Rule in Delhi. The scheme is as follows, each car will be allowed to run on Sunday if the sum of digits which are even is divisible by 4 or sum of digits which are odd in that number is divisible by 3. However to check every car for the above criteria can't be done by the Delhi Police. You need to help Delhi Police by finding out if a car numbered N will be allowed to run on Sunday?

    Input Format - The first line contains N , then N integers follow each denoting the number of the car.
    Constraints - N<=1000 Car No >=0 && Car No <=1000000000
    Output Format - N lines each denoting "Yes" or "No" depending upon whether that car will be allowed on Sunday or Not !
        Sample Input - 
            2
            12345
            12134
        Sample Output - 
            Yes
            No
        Explanation - 
            1 + 3 + 5 = 9 which is divisible by 3
            1 + 1 + 3 = 5 which is NOT divisible by 3 and 2+4 = 6 which is not divisble by 4.
*/

import java.util.Scanner;

public class Question15 {
    public static boolean check(int n){
        int temp = n;
        int sumEven = 0;
        int sumOdd = 0;
        int i = 1;
        while(temp > 0){
            int rem = temp%10;
            if(i%2 == 0){
                sumEven += rem;
            }else{
                sumOdd += rem;
            }
            i++;
            temp /= 10;
        }
        return (sumEven%4 == 0 || sumOdd%3 == 0);
    }
    public static String[] allowance(int arr[]){
        String[] result = new String[arr.length];
        for(int i = 0; i < arr.length; i++){
            if(check(arr[i])){
                result[i] = "Yes";
            }else{
                result[i] = "No";
            }
        }
        return result;
    }
    public static void main(String args[]) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the number of numbers you want to input in the array - ");
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i = 0; i < n; i++){
                System.out.print("Enter the number - ");
                arr[i] = sc.nextInt();
            }
            String[] result = allowance(arr);
            for(int i = 0; i < n; i++){
                if(result[i] == "Yes"){
                    System.out.println(arr[i] + " is allowed");
                }else{
                    System.out.println(arr[i] + " is not allowed");
                }
            }
        }
    }
}