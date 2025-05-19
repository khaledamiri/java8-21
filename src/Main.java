import java.util.Arrays;
import java.util.List;

public class Main {

    static void filter() {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        names.stream().filter(s -> s.startsWith("A")).forEach(name -> System.out.println(name.toUpperCase()));
    }


    public static void main(String[] args) {
        filter();
    }
}