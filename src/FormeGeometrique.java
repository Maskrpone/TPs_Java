public class FormeGeometrique {
    private String name;

    public FormeGeometrique() {
        this.name = "forme géométrique quelconque";
    }

    public FormeGeometrique(String name) {
        this.name = name;
    }

    public int calculerAire() {
        return 0;
    }

    public String getName() {
        return this.name;
    }

    public void afficherDetails() {
        System.out.println("La forme géométrique est : " + this.name);
        System.out.println("L'aire de cette forme géométrique est : " + this.calculerAire());
    }
}