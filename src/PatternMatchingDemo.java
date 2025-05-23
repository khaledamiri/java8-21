public class PatternMatchingDemo {
    public static void checkPoint(Object obj) {
        if (obj instanceof Point(int x, int y)) {
            if (x == y) {
                System.out.println("Diagonale");
            } else {
                System.out.println("Pas sur la diagonale");
            }
        } else {
            System.out.println("Objet non reconnu");
        }
    }
}
