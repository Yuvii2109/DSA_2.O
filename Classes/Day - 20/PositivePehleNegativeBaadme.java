public class PositivePehleNegativeBaadme {
    public static void sort(int arr[]){
        int i = 0; 
        int j = 0;
        while(j < arr.length){
            if(arr[j] <= 0){
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
    public static void main(String[] args) {
        int[] arr = {4, -5, 3, -2, 10, 3};
        sort(arr);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    } 
}