public class SwappingValues {
    public static void main(String[] args) {
        int y = 23;
        int k = 21;
        System.out.println("Initial values - " + y + ", " + k);
        int temp = y; // temp = 23
        y = k; // y = 21
        k = temp; // k = 23
        System.out.println("Swapped values - " + y + ", " + k);
        y = y + k; // 21 + 23 = 44
        k = y - k; // 44 - 23 = 21
        y = y - k; // 44 - 21 = 23
        System.out.println("Back to original - " + y + ", " + k);
    }
}