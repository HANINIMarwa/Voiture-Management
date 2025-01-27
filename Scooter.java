package voituretp2;
class Scooter extends Vehicule {
    private boolean besoinPermis;

    public Scooter(int id, String modele, int autonomieBatterie, boolean besoinPermis) {
        super(id, modele, autonomieBatterie);
        this.besoinPermis = besoinPermis;
    }

    @Override
    public String toString() {
        return "Scooter [ID=" + getId() + ", Modèle=" + getModele() + ", Autonomie=" + getAutonomieBatterie() + " km, Besoin de permis=" + besoinPermis + ", Disponible=" + isDisponible() + "]";
    }
}
