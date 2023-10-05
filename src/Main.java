public class Main {
    public static void main(String[] args) {

        java.util.Scanner ex = new java.util.Scanner(System.in);

        System.out.print("Choose the exercise to run : ");
        int number = ex.nextInt();

        switch (number) {
            case 1:
                CircleSpecs.circleSpecs();
                break;
            case 2:
                NumberSpecs.numberSpecs();
                break;
            case 3:
                BankingSystem.bankingSystem();
                break;
            case 4:
                BlackJack.blackJack();
                break;
            default:
                System.out.println("Exercise does not exist.");
                break;
        }
    }
}