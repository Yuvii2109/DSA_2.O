import java.util.Scanner;

public class BalancedParenthesesProblem {
    public static boolean isBalanced(String str){
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == '('){
                count++;
            }else{
                if(count == 0){
                    return false;
                }else{
                    count--;
                }
            }
        }
        return count == 0;
    }
    public static void printBalancedParentheses(int opening, int closing, String ans){
        // Either neeche wali backtrack condition or -
        // if(opening > closing){
        //     return;
        // }
        if(opening < 0 || closing < 0){
            return;
        }
        if(opening == 0 && closing == 0){
            if(isBalanced(ans)){
                System.out.println(ans);
            }
            return;
        }
        printBalancedParentheses(opening - 1, closing, ans + "(");
        if(opening < closing){
            // Backtrack Condition -
            printBalancedParentheses(opening, closing - 1, ans + ")");
        }
        /*
            Before applying condition -> isBalance(str), output -
                ((())), (()()), (())(), (()))(, ()(()), ()()(), ()())(, 
                ())((), ())()(, ()))((, )((()), )(()(), )(())(, )()((), 
                )()()(, )())((, ))(((), ))(()(, ))()((, )))(((
            
            After applying condition -> isBalance(str), output -
                ((())), (()()), (())(), ()(()), ()()()
        */
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter number of opening parentheses - ");
            int opening = sc.nextInt();
            System.out.print("Enter number of closing parentheses - ");
            int closing = sc.nextInt();
            printBalancedParentheses(opening, closing, "");
        }
    }
}