package voituretp2;


    // Sous-classe Camion
    class Camion extends Vehicule {
        private int capaciteChargement;

        public Camion(int id, String modele, int autonomieBatterie, int capaciteChargement) {
            super(id, modele, autonomieBatterie);
            this.capaciteChargement = capaciteChargement;
        }

        @Override
        public String toString() {
            return "Camion [ID=" + getId() + ", Modèle=" + getModele() + ", Autonomie=" + getAutonomieBatterie() + " km, Capacité de chargement=" + capaciteChargement + " kg, Disponible=" + isDisponible() + "]";
        }
    }


