package collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetApp {
    public static void main(String[] args) {
        Set<String> names = new LinkedHashSet<>();
        names.add("Edho");
        names.add("Dwi");
        names.add("Tirwanda");

        names.add("Edho");
        names.add("Dwi");
        names.add("Tirwanda");

        for (var name : names) {
            System.out.println(name);
        }

    }
}
