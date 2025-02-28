package tp1;

import tp1.modele.Livre;
import tp1.persistence.LivreRepository;
import tp1.service.LivreService;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException, InterruptedException {
        // Votre script qui utilise votre API ici

        TcpServer.startTcpServer();

        LivreService livreService = new LivreService(new LivreRepository());

        livreService.ajouteLivre("1232321", "Auteur", "Editeur", 2);


        Livre livre = livreService.getLivre("1232321");

        if (livre != null) {
            System.out.println("Details du livre:");
            System.out.println("ISBN: " + livre.getISBN());
            System.out.println("Auteur: " + livre.getAuteur());
            System.out.println("Editeur: " + livre.getEditeur());
            System.out.println("Nombre de pages: " + livre.getNombrePages());
        } else {
            System.out.println("Livre inconnu.");
        }


        Thread.currentThread().join();
    }
}
