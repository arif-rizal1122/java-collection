package imutableList;

import imutableList.data.Person;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) {

        Person person = new Person("asep");
        person.addHobby("coding");
        person.addHobby("mancing");
        person.addHobby("gaming");

        // doSomeThingWithHobbies(person.addHobby()); // error
        for (String hobby : person.getHobbies()){
            System.out.println(hobby);
        }
        System.out.println("============== ");
        List<String> names = List.of("aku", "tidak", "apa2");
        names.set(0, "ups"); // error
        names.remove(1); // error
        names.add("proggraming"); // error
        for (String name : names){
            System.out.print(name + ", ");
        }
        System.out.println("================== ");
        List<String> kosong = Collections.emptyList();
        List<String> one = Collections.singletonList("satu");
        List<String> mutable = new ArrayList<>();
        mutable.add("tambah");
        mutable.add("aja");
        List<String> imutable = Collections.unmodifiableList(mutable);
        List<String> elements = List.of("a", "b", "c");
        elements.add("sddd");
    }



    public static void doSomeThingWithHobbies(List<String> hobbies){
        hobbies.add("asyekkk");
    }

}
