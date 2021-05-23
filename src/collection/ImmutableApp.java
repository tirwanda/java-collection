package collection;

import collection.data.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImmutableApp {
    public static void main(String[] args) {
        List<String> one = Collections.singletonList("one");
        List<String> empty = Collections.emptyList();

        List<String> mutable = new ArrayList<>();
        mutable.add("Edho");
        mutable.add("Dwi");
        mutable.add("Tirwanda");
        List<String> immutable = Collections.unmodifiableList(mutable);

        List<String> elements = List.of("Edho", "Dwi", "Tirwanda");
//        elements.add("Not Supported");
    }
}
