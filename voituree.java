package voituretp2;

// Sous-classe Voiture
class Voiture extends Vehicule {
    private int nombrePortes;

    public Voiture(int id, String modele, int autonomieBatterie, int nombrePortes) {
        super(id, modele, autonomieBatterie);
        this.nombrePortes = nombrePortes;
    }

    @Override
    public String toString() {
        return "Voiture [ID=" + getId() + ", Modèle=" + getModele() + ", Autonomie=" + getAutonomieBatterie() + " km, Nombre de portes=" + nombrePortes + ", Disponible=" + isDisponible() + "]";
    }
}
