import java.util.HashMap;

public class StringCharFrequency {
    public static void main(String args[]){
        String str = "abaabgdcd";
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c : str.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for(char key : map.keySet()){
            System.out.println(key + " -> " + map.get(key));
        }
    }
}