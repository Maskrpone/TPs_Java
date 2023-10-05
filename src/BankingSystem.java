public class BankingSystem {
    public static void bankingSystem() {
        java.util.Scanner op = new java.util.Scanner(System.in);
        char cmd;

        System.out.print("Give the amount of money to put on your bank account : ");
        int account = op.nextInt();

        do {
            System.out.println("Vous avez " + account + " on your account.");
            System.out.println("What operation do you want to perform ?");
            System.out.print("(r)etrait, (d)épôt, (q)uitter : ");
            cmd = op.next().charAt(0);

            switch (cmd) {
                case 'r':
                    System.out.print("How much do you want to take ? : ");
                    int _retrait = op.nextInt();
                    if (_retrait < account) {
                        account -= _retrait;
                        System.out.println("Operation was successful.");
                    } else {
                        System.out.println("The amount of money you have does not allow you to take that much out of your account.");
                    }
                    break;
                case 'd':
                    System.out.print("How much money do you want to desposit on your account ? : ");
                    int _depot = op.nextInt();
                    account += _depot;
                    System.out.println("Operation was successfull.");
                    break;
                case 'q':
                    break;
                default:
                    System.out.println("Wrond typing. Please re-try.");
                    break;
            }

        } while (cmd != 'q');

    }
}
