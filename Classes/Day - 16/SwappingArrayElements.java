public class SwappingArrayElements {
    public static void swap1(int[] arr1, int[] arr2){
        int temp[] = arr1;
        arr1 = arr2;
        arr2 = temp;
    }
    // Swap nahi hoga
    public static void swap2(int[] arr1, int[] arr2){
        int temp = arr1[0];
        arr1[0] = arr2[0];
        arr2[0] = temp;
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {10, 20, 30, 40, 50};
        System.out.println(arr1[0] + ", " + arr2[0]);
        swap2(arr1, arr2);
        System.out.println(arr1[0] + ", " + arr2[0]);
    }
}