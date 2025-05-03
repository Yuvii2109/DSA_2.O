public class ZeroOneSorting {
    public static void sortZeroOne(int[] arr){
        int n = arr.length;
        int i = 0, j = 0;
        while(j < n){
            if(arr[j] == 1){
                j++;
            }else{
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j++;
            }
        }
    }
    public static void sortZeroOneAgain(int[] arr){
        int i = 0, j = arr.length-1;
        while(i <= j){
            if(arr[i] == 0){
                i++;
            }else if(arr[j] == 1){
                j--;
            }else{
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }

        }
    }
    public static void main(String[] args) {
        int arr[] = {0, 1, 1, 0, 0, 1};
        sortZeroOneAgain(arr);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}