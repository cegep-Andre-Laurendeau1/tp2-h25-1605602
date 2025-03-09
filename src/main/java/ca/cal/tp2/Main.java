package ca.cal.tp2;

import ca.cal.tp2.modele.Livre;
import ca.cal.tp2.persistence.DocumentRepository;
import ca.cal.tp2.persistence.DocumentRepositoryJPA;
import ca.cal.tp2.persistence.LivreRepository;
import ca.cal.tp2.service.DocumentService;
import ca.cal.tp2.service.LivreService;
import ca.cal.tp2.service.dto.DocumentDTO;

import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException, InterruptedException {
        // Votre script qui utilise votre API ici

//        TcpServer.startTcpServer();
//
//        LivreService livreService = new LivreService(new LivreRepository());
//
//        livreService.ajouteLivre("1232321", "Auteur", "Editeur", 2);
//
//
//        Livre livre = livreService.getLivre("1232321");
//
//        if (livre != null) {
//            System.out.println("Details du livre:");
//            System.out.println("ISBN: " + livre.getISBN());
//            System.out.println("Auteur: " + livre.getAuteur());
//            System.out.println("Editeur: " + livre.getEditeur());
//            System.out.println("Nombre de pages: " + livre.getNombrePages());
//        } else {
//            System.out.println("Livre inconnu.");
//        }


        TcpServer.startTcpServer();

        // Initialiser le service avec le repository
        DocumentService documentService = new DocumentService(new DocumentRepositoryJPA());

        // Ajouter un livre
        documentService.ajouteLivre("Titre du Livre", "1232321", "Auteur", "Éditeur", 200);

        // Récupérer le livre sous forme de DTO
        List<DocumentDTO> livreDTO = documentService.findByTitle("Titre du Livre");

        // Afficher les détails du livre
        if (livreDTO != null) {
            System.out.println("Détails du livre:");
            System.out.println("Titre: " + livreDTO.get(0).titre());
            System.out.println("Nombre d'exemplaires: " + livreDTO.get(0).nombreExemplaires());
        } else {
            System.out.println("Livre inconnu.");
        }







        Thread.currentThread().join();
    }
}
