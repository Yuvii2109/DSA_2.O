import java.util.Stack;

public class nextGreaterElement {
    public static void gandiApproach(int[] arr){
        int n = arr.length;
        int[] result = new int[n];
        for(int i = 0; i < n - 1; i++){
            result[i] = -1;
            for(int j = i + 1; j < n; j++){
                if(arr[j] > arr[i]){
                    result[i] = arr[j];
                    break;
                }
            }
        }
        result[n - 1] = -1;
        for(int num : result){
            System.out.print(num + " ");
        }
    }
    public static void nextGreaterArray(int[] arr){
        int n = arr.length;
        Stack<Integer> s = new Stack<>();
        int[] nextGreater = new int[n];
        for(int i = n - 1; i >= 0; i--){
            while(!s.isEmpty() && s.peek() <= arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nextGreater[i] = -1;
            }else{
                nextGreater[i] = s.peek();
            }
            s.push(arr[i]);
        }
        for(int num : nextGreater){
            System.out.print(num + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {9, 3, 10, 4, 2, 3, 5, 7};
        nextGreaterArray(arr);
    }
}