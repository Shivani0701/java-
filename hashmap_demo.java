
import java.util.HashMap;
import java.util.Map;

public class hashmap_demo {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();

        hashMap.put("John", 25);
        hashMap.put("Alice", 30);
        hashMap.put("Bob", 22);

        System.out.println("HashMap: " + hashMap);

        String keyToSearch = "Alice";
        if (hashMap.containsKey(keyToSearch)) {
            int age = hashMap.get(keyToSearch);
            System.out.println(keyToSearch + "'s age is " + age);
        } else {
            System.out.println(keyToSearch + " is not found in the HashMap");
        }

        System.out.println("Removing Bob from the HashMap");
        hashMap.remove("Bob");

        System.out.println("Updated HashMap: " + hashMap);
    }
}
