public class MinimizeMaxMinDifference {
    public static void minimization(int[] arr1, int[] arr2, int[] arr3){
        int minDifference = Integer.MAX_VALUE;
        int a = -1, b = -1, c = -1;
        for(int a1 : arr1){
            for(int a2 : arr2){
                for(int a3 : arr3){
                    int max = Math.max(a1, Math.max(a2, a3));
                    int min = Math.min(a1, Math.max(a2, a3));
                    int difference = max-min;
                    if(difference < minDifference){
                        minDifference = difference;
                        a = a1;
                        b = a2;
                        c = a3;
                    }
                }
            }
        }
        System.out.println("Minimum Difference is - " + minDifference);
        System.out.println("Best value from arr1 - " + a);
        System.out.println("Best value from arr2 - " + b);
        System.out.println("Best value from arr3 - " + c);
        // Time complexity - O(n*m*o)
    }
    public static void optimalMinimization(int[] arr1, int[] arr2, int[] arr3){
        int minDifference = Integer.MAX_VALUE;
        int i = 0, j = 0, k = 0;
        int a = -1, b = -1, c = -1;
        while(i < arr1.length && j < arr2.length && k < arr3.length){
            int max = Math.max(arr1[i], Math.max(arr2[j], arr3[k]));
            int min = Math.min(arr1[i], Math.min(arr2[j], arr3[k]));
            if(max-min < minDifference){
                minDifference = max-min;
                a = arr1[i];
                b = arr2[j];
                c = arr3[k];
            }
            if(min == arr1[i]){
                i++;
            }else if(min == arr2[j]){
                j++;
            }else{
                k++;
            }
        }
        System.out.println("Minimum Difference is - " + minDifference);
        System.out.println("Best value from arr1 - " + a);
        System.out.println("Best value from arr2 - " + b);
        System.out.println("Best value from arr3 - " + c);
        // Time complexity - O(n+m+o)
    }
    public static void main(String args[]){
        int arr1[] = {7, 10, 11, -2};
        int arr2[] = {6, 2, 4, 9};
        int arr3[] = {9, 5};
        minimization(arr1, arr2, arr3);
        optimalMinimization(arr1, arr2, arr3);
    }
}