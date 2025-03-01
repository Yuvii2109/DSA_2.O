import java.util.Scanner;

public class MaxOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers - ");
        System.out.print("a - ");
        int a = sc.nextInt();
        System.out.print("b - ");
        int b = sc.nextInt();
        if(a != b){
            if(a > b){
                System.out.println(a + " is a greater number");
            }else{
                System.out.println(b + " is a greater number");
            }
        }else{
            System.out.println(a + " = " + b);
        }
        sc.close();
    }
}