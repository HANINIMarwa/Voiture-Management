package voituretp2;

// Classe principale pour tester
public class main2 {
    public static void main(String[] args) {
        GestionParc gestionParc = new GestionParc();

        // Création des véhicules
        Vehicule voiture = new Voiture(1, "208", 200, 4);
        Vehicule camion = new Camion(2, "Renault ", 300, 5000);
        Vehicule scooter = new Scooter(3, "mercedes", 600, false);

        // Ajout des véhicules
        gestionParc.ajouterVehicule(voiture);
        gestionParc.ajouterVehicule(camion);
        gestionParc.ajouterVehicule(scooter);

        // Création des clients
        Client client1 = new Client("hafsa");
        Client client2 = new Client("janat");
        Client client3 = new Client("safae");
        // Ajout des clients
        gestionParc.ajouterClient(client1);
        gestionParc.ajouterClient(client2);
        gestionParc.ajouterClient(client3);
        // Affichage des véhicules disponibles
        gestionParc.afficherVehiculesDisponibles();

        // Affichage des clients
        gestionParc.afficherClients();

        // Louer un véhicule au client 1
        gestionParc.affecterVehiculeAClient(client1, 1);
        gestionParc.affecterVehiculeAClient(client2, 3);
        gestionParc.affecterVehiculeAClient(client3, 2);

        // Affichage des véhicules après location
        gestionParc.afficherVehiculesDisponibles();

        // Retourner le véhicule
        client1.retournerVehicule();

        // Affichage des véhicules après retour
        gestionParc.afficherVehiculesDisponibles();
    }
}

