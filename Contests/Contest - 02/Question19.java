/*
    Take the following as input.
        A number
    Assume that for a number of n digits, the value of each digit is from 1 to n and is unique. E.g. 32145 is a valid input number. Write a function that returns its inverse, where inverse is defined as follows - 
        Inverse of 32145 is 12543. In 32145, “5” is at 1st place, therefore in 12543, “1” is at 5th place; in 32145, “4” is at 2nd place, therefore in 12543, “2” is at 4th place.

    Print the value returned.

    Input Format - Integer
    Constraints - 0 < N < 1000000000
    Output Format - Integer
        Sample Input - 32145
        Sample Output - 12543
        Explanation - Assume that for a number of n digits, the value of each digit is from 1 to n and is unique. E.g. 32145 is a valid input number. Inverse of 32145 is 12543. In 32145, “5” is at 1st place, therefore in 12543, “1” is at 5th place; in 32145, “4” is at 2nd place, therefore in 12543, “2” is at 4th place.
*/

import java.util.Scanner;

public class Question19 {
    public static int findDigits(int n){
        int digit = 0;
        while(n != 0){
            digit++;
            n /= 10;
        }
        return digit;
    }
    public static int arrayToNumber(int arr[]){
        int result = 0;
        int placevalue = 1;
        for(int i = 1; i < arr.length; i++){
            result += placevalue*arr[i];
            placevalue *= 10;
        }
        return result;
    }
    public static void main(String args[]) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter a number to inverse - ");
            int n = sc.nextInt();
            int k = findDigits(n);
            int temp = n;
            int i = 1;
            int arr1[] = new int[k+1];
            while(temp != 0){
                arr1[i] = temp%10;
                temp /= 10;
                i++;
            }
            int arr2[] = new int[k+1];
            for(int j = 1; j <= k; j++){
                arr2[arr1[j]] = j;
            }
            int y = arrayToNumber(arr2);
            System.out.println("Original number - " + n);
            System.out.println("Inversed number - " + y);
        }
    }
}

/*
    Basically - ques is like -> 32145 isme 1st pr 5 hai toh 5th pr 1 hoga, that makes it 1_ _ _ _ , 2nd pr 4 hai toh 4th pr 2 hoga, that makes it 12_ _ _, 3rd pr 1 hai toh 1st pr 3 hoga, that makes it 12_ _3, 4th pr 2 hai toh 2nd pr 4 hoga, that makes it 12_43, 5th pr 3 hai toh 3rd pr 5 hoga and finally, 12543
*/