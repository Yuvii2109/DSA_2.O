import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number - ");
        int a = sc.nextInt();
        if(a % 2 == 0){
            System.out.println(a + " is an even Number");
        }else{
            System.out.println(a + " is an odd number");
        }
        sc.close();
    }
}