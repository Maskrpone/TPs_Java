public class CircleSpecs {
    public static void circleSpecs() {

        java.util.Scanner sc = new java.util.Scanner(System.in);

        final double PI = 3.14159;

        System.out.print("radius size : ");

        double rayon = sc.nextInt();

        if (rayon >= 0) {
            double perimeter = 2 * PI * rayon;

            double area = PI * rayon * rayon;

            System.out.println("The scope of the circle with a radius of " + rayon + " is about " + perimeter + " units, and its area is of " + area + " units.");
        } else {
            System.out.println("Please give a radius above 0.");
        }
    }
}
