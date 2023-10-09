// Author: Hippolyte DEPARIS

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("What do you want to do ?");
        System.out.println("1. Test classes");
        System.out.print("Choice -> ");

        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        switch(choice) {
            case 1:
                testClasses();
                break;
            case 2:
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
    // The following function initiates all of the different types of Emission, and uses their print() to the user so that it can control them.
    public static void testClasses() {
        Entertainment ent = new Entertainment("The Voice", "Nikos Aliagas");
        Movie movie = new Movie("The Lord of the Rings", 2001, "Peter Jackson", true, 178);
        Report report = new Report("C dans l'air", "Politics", 60);

        ent.print();
        System.out.println("--------------------");
        movie.print();
        System.out.println("--------------------");
        report.print();

        movie.setIsLive(false);
        movie.print();
    }
}