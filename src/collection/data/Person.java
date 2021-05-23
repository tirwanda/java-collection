package collection.data;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Person {
    private String name;
    private List<String> hobbies;

    public String getName() {
        return name;
    }

    public Person(String name) {
        this.name = name;
        this.hobbies = new ArrayList<>();
    }

    public void addHobby(String hobbie) {
        hobbies.add(hobbie);
    }

    public List<String> getHobbies() {
//        return hobbies; // Mutable List
        return Collections.unmodifiableList(hobbies); // immutable list
    }
}
