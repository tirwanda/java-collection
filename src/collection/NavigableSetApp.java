package collection;

import java.util.Collections;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class NavigableSetApp {
    public static void main(String[] args) {
        NavigableSet<String> names = new TreeSet<>();
        names.addAll(Set.of("Edho", "Dwi", "Tirwanda", "Backend", "Developer"));

        NavigableSet<String> namesReverse = names.descendingSet();
        NavigableSet<String> dwi = names.headSet("Dwi", true);
        NavigableSet<String> tirwanda = names.tailSet("Tirwanda", true);

        for(var name : tirwanda) {
            System.out.println(name);
        }

        NavigableSet<String> immutable = Collections.unmodifiableNavigableSet(names);
//        immutable.add("Error");

    }
}
