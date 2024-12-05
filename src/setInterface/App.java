package setInterface;

import java.util.EnumSet;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;




public class App {
    public static void main(String[] args) {

        Set<String> names = new HashSet<>();
        names.add("arif");
        names.add("rizal");
        names.add("aja");
        names.add("5");
        names.add("4");
        names.add("3");
        names.add("2");
        names.add("1");

        for (String name : names){
            System.out.println(name + ". ");
        }
        System.out.println("============= LinkedHash");
        Set<String> name = new LinkedHashSet<>();
        name.add("a");
        name.add("b");
        name.add("c");

        for (String nm : name){
            System.out.print(nm + ". ");
        }
        System.out.println("================ Enum Set");
        // EnumSet<Gender> genders = EnumSet.allOf(Gender.class);
        EnumSet<Gender> genders = EnumSet.of(Gender.Female, Gender.Not_Mention);
        for (Gender gender : genders) {
            System.out.println(gender);
        }
        System.out.println("================== ");
        Gender[] res = Gender.values();
        System.out.println(res.toString());

    }
}
