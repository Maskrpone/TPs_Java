public class Main {
    public static void main(String[] args) {
        Notes notes = new Notes();
        int[] toTest = new int[]{15, -15, 17, 11, 14};

        for (int j : toTest) {
            try {
                notes.addNote(j);
            } catch (ErrorExceptions e) {
                System.out.println("Error:" + e.getMessage());
            }
        }
        notes.getNotes();
    }
}