import java.util.HashMap;
import java.util.Map;

public class BuiltInHashMap {
    public static void main(String args[]){
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("Rohan", 1);
        hm.put("Sohan", 2);
        hm.put("Mohan", 3);
        System.out.println(hm);

        System.out.println(hm.get("Rohan"));
        System.out.println(hm.get("Mohan"));
        System.out.println(hm.get("Sohan"));

        System.out.println(hm.getOrDefault("Rohan", -1));
        System.out.println(hm.getOrDefault("Manmohan", -1));

        System.out.println(hm.containsKey("Rohan"));
        System.out.println(hm.containsKey("Gaurav"));

        hm.remove("Rohan");
        System.out.println(hm);

        hm.put("Mohan", 10);
        System.out.println(hm);

        for(String key : hm.keySet()){
            System.out.println(key + " -> " + hm.get(key));
        }

        for(int val : hm.values()){
            System.out.println(val);
        }

        for(Map.Entry<String, Integer> entry : hm.entrySet()){
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}