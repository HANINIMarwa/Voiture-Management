package voituretp2;

// Classe Client
class Client {
    private String nom;
    private Vehicule vehiculeLoue;

    public Client(String nom) {
        this.nom = nom;
        this.vehiculeLoue = null;
    }

    public String getNom() {
        return nom;
    }

    public Vehicule getVehiculeLoue() {
        return vehiculeLoue;
    }

    public void louerVehicule(Vehicule vehicule) {
        if (this.vehiculeLoue == null) {
            this.vehiculeLoue = vehicule; // Associer le véhicule au client
            System.out.println(this.nom + " a loué " + vehicule);
        } else {
            System.out.println(this.nom + " a déjà un véhicule loué.");
        }
    }


    public void retournerVehicule() {
        if (this.vehiculeLoue != null) {
            this.vehiculeLoue.setDisponible(true);
            System.out.println(nom + " a retourné " + vehiculeLoue);
            this.vehiculeLoue = null;
        } else {
            System.out.println(nom + " n'a pas de véhicule à retourner.");
        }
    }
}
