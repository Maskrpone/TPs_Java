// Author: Hippolyte DEPARIS

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("What do you want to do ?");
        System.out.println("1. Test classes");
        System.out.println("2. Use the program");
        System.out.print("Choice -> ");

        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        switch(choice) {
            case 1:
                testClasses();
                break;
            case 2:
                tvProgram();
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
    // The following method initiates all the different types of Emission, and uses their print() so the user can control them.
    public static void testClasses() {
        Entertainment ent = new Entertainment("The Voice", "Nikos Aliagas");
        Movie movie = new Movie("The Lord of the Rings", 2001, "Peter Jackson", true, 3);
        Report report = new Report("C dans l'air", "Politics", 2);

        ent.print();
        System.out.println("--------------------");
        movie.print();
        System.out.println("--------------------");
        report.print();

        movie.setIsLive(false);
        movie.print();
    }
    // The following function initiate the program
    public static void tvProgram() {
        // Creation of a program calendar
        Programmation program = new Programmation();
        // creation of a movie to put in our schedule
        Movie film = new Movie("The Lord of the Rings", 2001, "Peter Jackson", false, 3);
        film.setStart(19);
        // if the movie is compatible with the schedule, we add it.
        // otherwise, an error is thrown.
        try {
            program.add(film);
        } catch (InvalidSchedule e) {
            System.out.println("Error: " + e.getMessage());
        }

        // overlapping test
        Entertainment ent = new Entertainment("The Voice", "Nikos Aliagas");
        ent.setStart(20);

        try {
            program.add(ent);
        } catch (InvalidSchedule e) {
            System.out.println("Error: " + e.getMessage());
        }
        // display
        program.displayProgram();
    }
}