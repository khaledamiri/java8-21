import java.util.Arrays;
import java.util.List;

public class Main {
    static List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
    static List<Integer> liste = Arrays.asList(1, 2, 3, 4, 5, 6);

    static void filter() {
        names.stream().filter(s -> s.startsWith("A")).forEach(name -> System.out.println(name.toUpperCase()));
    }

    static Integer sumOfPairNumber() {
        return liste.stream().filter(integer -> integer % 2 == 0).mapToInt(value -> value).sum();
    }


    public static void main(String[] args) {
        //filter();
        //System.out.println(sumOfPairNumber());
        int sum = liste.stream().filter(integer -> integer % 2 == 0).mapToInt(value -> value).sum();
        System.out.println(sum);

        //Record
        PatternMatchingDemo.checkPoint(new Point(3, 3));  // Diagonale
        PatternMatchingDemo.checkPoint(new Point(2, 5));  // Pas sur la diagonale
        PatternMatchingDemo.checkPoint("Hello");           // Objet non reconnu

    }
}