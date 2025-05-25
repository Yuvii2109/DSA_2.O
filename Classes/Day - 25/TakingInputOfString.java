import java.util.Scanner;

public class TakingInputOfString {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter a String - ");
            // String k = sc.next();
            // System.out.println(k);
            // Iske baad input lena hi band krdega yeh
            String y = sc.nextLine();
            System.out.println("Hi, " + y);
        }
    }
}