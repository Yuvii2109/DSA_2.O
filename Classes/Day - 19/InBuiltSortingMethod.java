import java.util.Arrays;
import java.util.Collections;

public class InBuiltSortingMethod {
    public static void main(String[] args) {
        int arr1[] = {5, 6, 8, 9, 2, 3, 4, 1};
        Arrays.sort(arr1);
        System.out.print("Ascending Order - ");
        for(int i = 0; i < arr1.length; i++){
            System.out.print(arr1[i] + " ");
        }
        Integer arr2[] = {5, 6, 8, 9, 2, 3, 4, 1};
        System.out.print("\nDescending Order - ");
        Arrays.sort(arr2, Collections.reverseOrder());
        for(int i = 0; i < arr2.length; i++){
            System.out.print(arr2[i] + " ");
        }
    }
}