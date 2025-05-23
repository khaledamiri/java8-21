public class PatternMatching {
    public static void main(String[] args) {
//        Object value = 42;
//        simpleMatching(value);

        Object obj = "Salamou alaykom";
        Object o = patternMatchingWithSwitch(obj);
        System.out.println(o);

        Object record = new Point(3, 4);
        Object info = patternMatchingWithRecord(record);
        System.out.println(info);
    }

    private static Object patternMatchingWithRecord(Object obj) {
        return switch (obj) {
            case Point(int x, int y) -> "Coordonnées : x=" + x + ", y=" + y;
            default -> "Pas un point";
        };
    }

    private static Object patternMatchingWithSwitch(Object obj) {
        return switch (obj) {
            case String s -> "Chaîne de " + s.length() + " caractères";
            case Integer i -> "Entier doublé : " + (i * 2);
            default -> "Type inconnu";
        };
    }

    private static void simpleMatching(Object value) {
        if (value instanceof String s) {
            System.out.println("Texte : " + s.toLowerCase());
        } else if (value instanceof Integer i) {
            System.out.println("Nombre : " + (i * 2));
        }
    }
}
