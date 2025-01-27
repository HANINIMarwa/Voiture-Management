package voituretp2;

public class Vehicule {

    private int id;
    private String modele;
    private int autonomieBatterie;
    private boolean disponible;

    // Constructeur
    public Vehicule(int id, String modele, int autonomieBatterie) {
        this.id = id;
        this.modele = modele;
        this.autonomieBatterie = autonomieBatterie;
        this.disponible = true;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public int getAutonomieBatterie() {
        return autonomieBatterie;
    }

    public void setAutonomieBatterie(int autonomieBatterie) {
        this.autonomieBatterie = autonomieBatterie;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return "Vehicule [id=" + id + ", modele=" + modele + ", autonomieBatterie=" + autonomieBatterie + " km, disponible=" + disponible + "]";
    }
}
