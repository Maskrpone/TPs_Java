public class Triangle extends FormeGeometrique {
    private int base;
    private int hauteur;
    public Triangle() {
        super("Triangle");
        this.base = 0;
        this.hauteur = 0;
    }
    public Triangle(int base, int hauteur) {
        super("Triangle");
        this.base = base;
        this.hauteur = hauteur;
    }
    @Override public int calculerAire() {
        return (int)(this.base * this.hauteur)/2;
    }
    @Override public void afficherDetails() {
        System.out.println("La forme géométrique est : " + this.getName());
        System.out.println("L'aire de cette forme géométrique est : " + this.calculerAire());
        System.out.println("La base est de " + this.base + " et la hauteur est de " + this.hauteur);
    }

}
