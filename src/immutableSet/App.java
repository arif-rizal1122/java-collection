package immutableSet;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class App {
    public static void main(String[] args) {

        Set<String> empty = Collections.emptySet();
        Set<String> one = Collections.singleton("hy");

        Set<String> mutable = new HashSet<>();
        mutable.add("arif");
        mutable.add("rizal");
        Set<String> immutable = Collections.unmodifiableSet(mutable);

        Set<String> set = Set.of("eki","asep","eki"); // disini hanya terhitung 2 data nya karena tidak boleh duplicat // hasilnya error
        // set.remove("eki");

    }
}
