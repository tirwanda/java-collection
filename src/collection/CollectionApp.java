package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionApp {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();

        collection.add("Edho");
        collection.add("Dwi");
        collection.add("Tirwanda");
        collection.addAll(List.of("BackEnd", "Developer"));
        for (var value : collection) {
            System.out.println(value);
        }

        System.out.println("============ Remove ==============");
        collection.remove("Back End");
        collection.removeAll(List.of("Developer", "Tirwanda"));
        for (var value : collection) {
            System.out.println(value);
        }

        System.out.println(collection.contains("Edho"));
        System.out.println(collection.containsAll(List.of("BackEnd", "Dwi")));
    }
}
