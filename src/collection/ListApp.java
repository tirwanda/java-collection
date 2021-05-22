package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListApp {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
//        List<String> strings = new LinkedList<>();
        strings.add("Edo");
        strings.add("Dwi");
        strings.add("Tirwanda");

        strings.set(0,"Edho");
        strings.remove(1);
        System.out.println(strings.get(0));
    }
}
