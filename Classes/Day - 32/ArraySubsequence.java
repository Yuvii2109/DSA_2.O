import java.util.ArrayList;

public class ArraySubsequence {
    public static void printSubsequences(int[] arr, int index, ArrayList<Integer> res){
        if(index == arr.length){
            System.out.println(res);
            return;
        }
        res.add(arr[index]); // Including current index
        printSubsequences(arr, index + 1, res);
        res.remove(res.size() - 1); // Not Including - Backtrack (removing last added value to undo the inclusion)
        printSubsequences(arr, index + 1, res);
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        ArrayList<Integer> res = new ArrayList<>();
        printSubsequences(arr, 0, res);
    }
}