import java.util.*;

public class Notes {
    private final ArrayList<String> students = new ArrayList<>();
    private final Map<String, ArrayList<Number>> noteArray = new HashMap<>();
    public void addNotes(String name, Number[] notes) {
        ArrayList<Number> tmp_notes = new ArrayList<>();
        Collections.addAll(tmp_notes, notes);

        this.students.add(name);
        this.noteArray.put(name, tmp_notes);
    }
    public double average(ArrayList<Number> notes) {
        double somme = 0.0;
        for (Number note : notes) somme += note.doubleValue();
        return somme / notes.size();
    }
    public double classAverage() {
        double somme = 0.0;
        for (String student : this.students) somme += this.average(noteArray.get(student));
        return somme / this.students.size();
    }
    public void display(String student) {
        System.out.print(student + "\t:\t");
        for (int i = 0; i < noteArray.get(student).size(); i++) System.out.print(noteArray.get(student).get(i) + "\t");
        System.out.println(this.average(this.noteArray.get(student)));
    }
    public void displayAll() {
        System.out.println("Statistiques de la classe : ");
        this.students.forEach(this::display);
        System.out.println("Average in this class : " + this.classAverage());
    }
}
