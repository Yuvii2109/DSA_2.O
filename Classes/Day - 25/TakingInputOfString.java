import java.util.Scanner;

public class TakingInputOfString {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter a String - ");
            String y = sc.nextLine();
            System.out.println("Hi, " + y);
        }
    }
}