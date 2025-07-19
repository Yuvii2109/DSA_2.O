import java.util.ArrayList;

public class UnderstandingBacktracking {
    public static void printSubsequencesLessThanTarget(int[] arr, int index, int target, int sum, ArrayList<Integer> al){
        if(index == arr.length){
            if(sum <= target){
                System.out.println(al);
            }
            return;
        }
        al.add(arr[index]);
        printSubsequencesLessThanTarget(arr, index + 1, target, sum + arr[index], al);
        al.remove(al.size() - 1);
        printSubsequencesLessThanTarget(arr, index + 1, target, sum, al);
    }
    // Ab dekh bhai... hmare code main specified hai ki saare elements of the array are positive... Toh yahan backtracking ho sakti hai... agar array main negative elements bhi hote... toh normal recursion ka hi use krte...
    public static void usingBacktrackingApproach(int[] arr, int index, int target, int sum, ArrayList<Integer> al){
        if(sum > target){
            return;
        }
        if(index == arr.length){
            if(sum <= target){
                System.out.println(al);
            }
            return;
        }
        al.add(arr[index]);
        usingBacktrackingApproach(arr, index + 1, target, sum + arr[index], al);
        al.remove(al.size() - 1);
        usingBacktrackingApproach(arr, index + 1, target, sum, al);
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 3, 4};
        int target = 7;
        ArrayList<Integer> al = new ArrayList<>();
        System.out.println("Using Normal Recursions -");
        printSubsequencesLessThanTarget(arr, 0, target, 0, al);
        System.out.println("\nUsing Optimised Recursions (Backtracking) -");
        usingBacktrackingApproach(arr, 0, target, 0, al);
    }
}