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
    // The following function initiates all of the different types of Emission, and uses their print() so the user can control them.
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

    public static void tvProgram() {
        Programmation program = new Programmation();
        program.setProgram(12, new Entertainment("The Voice", "Nikos Aliagas"));
        // printv2 under development
        program.print();
    }
}