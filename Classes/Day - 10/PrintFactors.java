import java.util.Scanner;

public class PrintFactors {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the number - ");
            int n = sc.nextInt();
            System.out.println("Factors of " + n + " are - ");
            for(int i = 1; i <= Math.sqrt(n); i++){ 
                // Aadhe factors of a number are less than the number's square root rest all are just the quotients when we divide the number with the obtained factors
                if(n%i == 0){
                    if(n/i != i){
                        System.out.print(i + ", ");
                        System.out.print(n/i + " ");
                    }else{
                        System.out.print(i + " ");
                    }
                    System.out.println();
                }
            }
        }
    }
}