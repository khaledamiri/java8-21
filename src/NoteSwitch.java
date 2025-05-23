public class NoteSwitch {

    public static void main(String[] args) {
        int note = 4;

        switchWithFlech(note);
    }

    private static void switchWithFlech(int note) {
        switch (note) {
            case 1, 2 -> System.out.println("Insuffisant");
            case 3 -> System.out.println("Moyen");
            case 4 -> System.out.println("Bien");
            case 5 -> System.out.println("Excellent");
            default -> System.out.println("Note invalide");
        }
    }
}
