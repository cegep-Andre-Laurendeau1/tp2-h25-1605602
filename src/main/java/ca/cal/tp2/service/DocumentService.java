package ca.cal.tp2.service;

import ca.cal.tp2.modele.Document;
import ca.cal.tp2.modele.Livre;
import ca.cal.tp2.persistence.DocumentRepository;

public class DocumentService {

    private final DocumentRepository documentRepository;

    public DocumentService(DocumentRepository documentRepository) {
        this.documentRepository = documentRepository;
    }


    public void verifieDisponibilite(Document document) {


    }

    public void ajouteLivre(String titre, String ISBN, String auteur, String editeur, int nombreDePages) {

        documentRepository.save(new Livre(
                titre, 1, ISBN, auteur, editeur, nombreDePages
        ));

    }


}
