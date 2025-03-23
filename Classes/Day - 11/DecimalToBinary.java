import java.util.Scanner;
import java.util.Stack;

public class DecimalToBinary {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            Stack<Integer> s = new Stack<>();
            System.out.print("Enter the decimal number - ");
            int n = sc.nextInt();
            int temp = n;
            while(n != 0){
                int rem = n%2;
                s.push(rem);
                n /= 2;
            }
            System.out.print("Binary conversion of the entered number " + temp + " is - ");
            while(!s.isEmpty()){
                System.out.print(s.pop());
            }
        }
    }
}