import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principle Amount - ");
        float P = sc.nextFloat();
        System.out.print("Enter Tenure - ");
        float T = sc.nextFloat();
        System.out.print("Enter Rate Of Interst - ");
        float R = sc.nextFloat();
        float SI = (P*T*R)/100;
        System.out.println("Simple Interest (4 Buckets) - " + SI);
        System.out.println("Simple Interest (3 Buckets) - " + ((P*T*R)/100));
        sc.close();
    }
}