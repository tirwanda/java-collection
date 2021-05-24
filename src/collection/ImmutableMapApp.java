package collection;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ImmutableMapApp {
    public static void main(String[] args) {
        Map<String, String> empty = Collections.emptyMap();
        Map<String,String> singleton = Collections.singletonMap("name", "Edho");
        Map<String,String> mutable = new HashMap<>();

        mutable.put("firstName", "Edho");
        mutable.put("middleName",  "Dwi");
        mutable.put("lastName", "Tirwanda");
        Map<String, String> immutable = Collections.unmodifiableMap(mutable);
//        immutable.put("Error", "Error");
        Map<String, String> map = Map.of(
                "first", "Edho",
                "middle", "Dwi",
                "last", "Tirwanda"
        );
//        map.put("Error", "Error");
    }
}
