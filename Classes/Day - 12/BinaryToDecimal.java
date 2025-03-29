import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the binary number - ");
            int n = sc.nextInt();
            int decimal = 0;
            int placevalue = 1;
            int temp = n;
            while(n != 0){
                int rem = n%10;
                decimal += rem*placevalue;
                n /= 10;
                placevalue *= 2;
            }
            System.out.println("Decimal value of " + temp + " is - " + decimal);
        }
    }
}