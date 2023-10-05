public class NumberSpecs {
    public static void numberSpecs() {
        java.util.Scanner pos = new java.util.Scanner(System.in);
        System.out.print("Type a positive number : ");
        int num = pos.nextInt();

        if (num > 0) {
            if ((num % 2 == 0)) {
                System.out.print(num + " is even");
            } else {
                System.out.print(num + "is not even.");
            }
        } else {
           System.out.println("Integer entered incorrect");
        }
    }
}
