package collection;

import java.util.List;
import java.util.Vector;

public class VectorApp {
    public static void main(String[] args) {
        List<String> list = new Vector<>();

        list.add("Edho");
        list.add("Dwi");
        list.add("Tirwanda");

        for (var value : list) {
            System.out.println(value);
        }
    }
}
