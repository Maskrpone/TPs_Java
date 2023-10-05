public class Triangle extends FormeGeometrique {
    private final int base;
    private final int hauteur;

    public Triangle(int base, int hauteur) {
        super("Triangle");
        this.base = base;
        this.hauteur = hauteur;
    }

    public final int getBase() {
        return this.base;
    }

    public final int getHauteur() {
        return this.hauteur;
    }

    @Override
    public int calculerAire() {
        return (this.base * this.hauteur) / 2;
    }

    @Override
    public void afficherDetails() {
        System.out.println("La forme géométrique est : " + this.getName());
        System.out.println("L'aire de cette forme géométrique est : " + this.calculerAire());
        System.out.println("La base est de " + this.getBase() + " et la hauteur est de " + this.getHauteur());
    }

}
