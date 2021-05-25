package collection;

import java.util.Hashtable;
import java.util.Map;

public class HashTableApp {
    public static void main(String[] args) {
        Map<String, String> map = new Hashtable<>();

        map.put("first", "Edho");
        map.put("middle", "Dwi");
        map.put("last", "Tirwanda");

        for (var key : map.keySet()) {
            System.out.println(key);
        }
    }
}
