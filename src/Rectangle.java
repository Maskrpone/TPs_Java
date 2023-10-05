public class Rectangle extends FormeGeometrique {
    private int base;
    private int largeur;

    public Rectangle() {
        super("Rectangle");
        this.base = 0;
        this.largeur = 0;
    }

    public Rectangle(int base, int largeur) {
        super("Rectangle");
        this.base = base;
        this.largeur = largeur;
    }

    @Override public int calculerAire() {
        return this.base * this.largeur;
    }

    @Override public void afficherDetails() {
        System.out.println("La forme géométrique est : " + this.getName());
        System.out.println("L'aire de cette forme géométrique est : " + this.calculerAire());
        System.out.println("La base fait " + this.base + " et la largeur est de " + this.largeur);
    }
}
