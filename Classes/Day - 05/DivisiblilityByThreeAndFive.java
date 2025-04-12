import java.util.Scanner;

public class DivisiblilityByThreeAndFive {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number - ");
        int n = sc.nextInt();
        if(n%15 == 0){
            System.out.println(n + " is divisible by 3 as well as 5");
        }else if(n%3 == 0 && n%5 != 0){
            System.out.println(n + " is divisible by 3 but not by 5");
        }else if(n%5 == 0 && n%3 != 0){
            System.out.println(n + " is divisible by 5 but not by 3");
        }else{
            System.out.println(n + " is not divisible by 3 or 5");
        }
        sc.close();
    }
}