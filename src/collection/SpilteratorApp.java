package collection;

import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public class SpilteratorApp {
    public static void main(String[] args) {
        List<String> list = List.of("Edho", "Dwi", "Tirwanda", "Java", "Backend", "Developer");

        Spliterator<String> spliterator1 = list.spliterator();
        Spliterator<String> spliterator2 = spliterator1.trySplit();

        System.out.println(spliterator1.estimateSize());
        System.out.println(spliterator2.estimateSize());

        spliterator1.forEachRemaining(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        spliterator2.forEachRemaining(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
    }
}
