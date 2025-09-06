import java.util.HashMap;

public class CheckFrequency {
    public static void main(String args[]){
        int arr[] = {1, 2, 1, 10, 3, 10, 3, 10, 1, 1, 3, 10};
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int a : arr){
            map.put(a, map.getOrDefault(a, 0) + 1);
        }
        for(int key : map.keySet()){
            System.out.println(key + " -> " + map.get(key));
        }
    }
}