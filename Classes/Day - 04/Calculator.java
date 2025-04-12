import java.util.Scanner;

public class Calculator {
    public static void main(String args[]){
        System.out.println("Calculator for 2 numbers - ");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number a - ");
        float a = sc.nextFloat();
        System.out.print("Enter number b - ");
        float b = sc.nextFloat();
        System.out.println(a + " + " + b + " = " + (a+b));
        System.out.println(a + " - " + b + " = " + (a-b));
        System.out.println(a + " x " + b + " = " + (a*b));
        System.out.println(a + " / " + b + " = " + (a/b));
        System.out.println(a + " % " + b + " = " + (a%b));
        sc.close();
    }
}