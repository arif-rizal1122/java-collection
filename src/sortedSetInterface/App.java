package sortedSetInterface;

import imutableList.data.Person;

import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) {

        SortedSet<Person> people = new TreeSet<>(new PersonComparator().reversed()); // reversed ini untuk perururtan
        people.add(new Person("asep"));
        people.add(new Person("adel"));
        people.add(new Person("jeki"));

        for (Person person : people){
            System.out.println(person.getName());
        }
        System.out.println("===================== ");
        SortedSet<Person> people1 = Collections.unmodifiableSortedSet(people);
        // people1.add("ehem"); // gak bisa

    }
}
