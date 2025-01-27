package voituretp2;



import java.util.ArrayList;

public class GestionParc {

    private ArrayList<Vehicule> listeVehicules;
    private ArrayList<Client> listeClients;

    // Constructeur
    public GestionParc() {
        this.listeVehicules = new ArrayList<>();
        this.listeClients = new ArrayList<>();
    }

    // Méthode pour ajouter un véhicule au parc
    public void ajouterVehicule(Vehicule vehicule) {
        listeVehicules.add(vehicule);
        System.out.println("Véhicule ajouté : " + vehicule);
    }

    // Méthode pour ajouter un client
    public void ajouterClient(Client client) {
        listeClients.add(client);
        System.out.println("Client ajouté : " + client.getNom());
    }

    // Méthode pour afficher les véhicules disponibles
    public void afficherVehiculesDisponibles() {
        System.out.println("Véhicules disponibles :");
        for (Vehicule vehicule : listeVehicules) {
            if (vehicule.isDisponible()) {
                System.out.println(vehicule);
            }
        }
    }

    // Méthode pour afficher tous les clients
    public void afficherClients() {
        System.out.println("Liste des clients :");
        for (Client client : listeClients) {
            System.out.println(client.getNom() + " - Véhicule loué : " + (client.getVehiculeLoue() != null ? client.getVehiculeLoue() : "Aucun"));
        }
    }

    // Méthode pour louer un véhicule à un client
    // Méthode pour louer un véhicule à un client
    public void affecterVehiculeAClient(Client client, int vehiculeId) {
        Vehicule vehicule = trouverVehiculeParId(vehiculeId);
        if (vehicule != null && vehicule.isDisponible()) {
            vehicule.setDisponible(false); // Marquer le véhicule comme loué
            client.louerVehicule(vehicule); // Ajouter le véhicule au client
            System.out.println("Véhicule " + vehiculeId + " loué au client : " + client.getNom());
        } else {
            System.out.println("Le véhicule n'est pas disponible ou n'existe pas.");
        }
    }


    // Méthode pour trouver un véhicule par son ID
    private Vehicule trouverVehiculeParId(int vehiculeId) {
        for (Vehicule vehicule : listeVehicules) {
            if (vehicule.getId() == vehiculeId) {
                return vehicule;
            }
        }
        return null;
    }
}
