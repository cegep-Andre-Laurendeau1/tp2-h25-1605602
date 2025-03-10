package ca.cal.tp2.service;

import ca.cal.tp2.modele.CD;
import ca.cal.tp2.modele.DVD;
import ca.cal.tp2.modele.Document;
import ca.cal.tp2.modele.Livre;
import ca.cal.tp2.persistence.DocumentRepository;
import ca.cal.tp2.service.dto.DocumentDTO;
import ca.cal.tp2.service.dto.LivreDTO;

import java.util.List;

public class DocumentService {

    private final DocumentRepository documentRepository;

    public DocumentService(DocumentRepository documentRepository) {
        this.documentRepository = documentRepository;
    }


    public void verifieDisponibilite(Document document) {


    }

    public void ajouteLivre(String titre, String ISBN, String auteur, String editeur, int nombreDePages) {
        List<Document> documents = documentRepository.findByTitre(titre);

        if (documents.isEmpty()) {
            documentRepository.save(new Livre(titre, 1, ISBN, auteur, editeur, nombreDePages));
        } else {
            Document existingDocument = documents.get(0);
            existingDocument.setNombreExemplaires(existingDocument.getNombreExemplaires() + 1);
            documentRepository.save(existingDocument);
        }
    }

    public void ajouteCD(String titre, String artiste, int duree, String genre) {
        List<Document> documents = documentRepository.findByTitre(titre);

        if (documents.isEmpty()) {
            documentRepository.save(new CD(titre, 1, artiste, duree, genre));
        } else {
            Document existingDocument = documents.get(0);
            existingDocument.setNombreExemplaires(existingDocument.getNombreExemplaires() + 1);
            documentRepository.save(existingDocument);
        }
    }

    public void ajouteDVD(String titre, String director, int duree, String genre) {
        List<Document> documents = documentRepository.findByTitre(titre);

        if (documents.isEmpty()) {
            documentRepository.save(new DVD(titre, 1, director, duree, genre));
        } else {
            Document existingDocument = documents.get(0);
            existingDocument.setNombreExemplaires(existingDocument.getNombreExemplaires() + 1);
            documentRepository.save(existingDocument);
        }
    }



    public List<DocumentDTO> findByTitle(String titre) {
        List<Document> documents = documentRepository.findByTitre(titre);

        return documents.stream().map(DocumentDTO::toDTO).toList();
    }

    public List<LivreDTO> findByAuteur(String auteur) {
        List<Livre> documents = documentRepository.findByAuteur(auteur);

        return documents.stream().map(LivreDTO::toDTO).toList();
    }





}
