public class BlackJack {
    public static void blackJack(){

        final int LIM = 21;

        java.util.Scanner sc = new java.util.Scanner(System.in);

        String[] numbers = {"one", "two", "three", "four", "five", "six"};

        System.out.print("Do you want to throw the dice ? (y/n) ");
        char action = sc.next().charAt(0);

        int scoreUser = 0;
        int scoreBank = 0;

        int nbTirage = 0;
        int dice;

        do {

            if (action == 'y' || action == 'Y') {
                ++nbTirage;
                dice = (int) ((Math.random() * 7) + 1);
                scoreUser += dice;
                System.out.println("Throw number " + nbTirage + ", score : " + numbers[dice - 1] + " (total " + scoreUser + " )");
            }

            System.out.print("Do you want to throw the dice again ? (y/n) ");
            action = sc.next().charAt(0);

        } while (action != 'n' && action != 'N');

        if (scoreUser == LIM) {
            System.out.print("Black Jack ! You have won !");
        } else if (scoreUser > LIM) {
            System.out.print("You have lost :(");
        } else {
            System.out.println("The bank is joining the game...");
            while (scoreBank <= scoreUser) {
                scoreBank += (int) ((Math.random() * 7) + 1);
            }
            if (scoreBank <= 21) {
                System.out.println("The bank won with a score of " + scoreBank);
            }
            else {
                System.out.println("You have won against the bank ( " + scoreBank + ")");
            }
        }


    }
}
