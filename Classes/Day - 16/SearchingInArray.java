public class SearchingInArray {
    public static boolean isPresent(int arr[], int target){
        for(int a : arr){
            if(a == target){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int target = 3;
        System.out.println(isPresent(arr, target));
    }
}