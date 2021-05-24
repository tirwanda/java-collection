package collection;

import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMapApp {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new WeakHashMap<>();

        for (var i = 0; i < 1000000; i++ ) {
            map.put(i, i);
        }

        System.gc();

        System.out.println(map.size());
    }
}
