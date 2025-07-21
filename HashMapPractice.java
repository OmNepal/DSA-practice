import java.util.HashMap;
import java.util.Map;

public class HashMapPractice {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Raju", 29);
        map.put("Suzanne", 27);
        map.put("Harkirat", 45);

        System.out.println(map);

        System.out.println(map.get("Raju")); //get a value mapped to the key

        if (!map.containsKey("Om")) { //check if the map contains a key
            System.out.println("doesn't contain Om");
        }

        // Iterating over a Hashmap: we use an enhanced for loop to access each key-value pair from the set of all key-value pairs
        for (Map.Entry<String, Integer> entry: map.entrySet()) {
            System.out.print(entry.getKey() + " -> ");
            System.out.println(entry.getValue());
        }

        map.remove("Harkirat"); //removing a key value pair using the key
        System.out.println(map);

        //if the provided key is present, operation returned by the function(2nd parameter) is performed
        map.computeIfPresent("Raju", (k, v) -> v + 1);

        System.out.println(map);

        map.put("Hozae", 77);
        map.put("Fifty", 25);

        map.forEach((k, v) -> {
            map.put(k, k.length()); //this action will be performed for each entry in the map
        });

        System.out.println(map);
    }

}
