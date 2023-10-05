public class Cercle extends FormeGeometrique {
    private final int rayon;

    public Cercle(int rayon) {
        super("Cercle");
        this.rayon = rayon;
    }

    public final int getRayon() {
        return this.rayon;
    }

    @Override public int calculerAire() {
        return (int)Math.PI * this.rayon * this.rayon;
    }

    @Override public void afficherDetails() {
        System.out.println("La forme géométrique est : " + this.getName());
        System.out.println("L'aire de cette forme géométrique est : " + this.calculerAire());
        System.out.println("Le rayon est de " + this.getRayon());
    }

}
