package ca.cal.tp2.persistence;

import ca.cal.tp2.modele.CD;
import ca.cal.tp2.modele.DVD;
import ca.cal.tp2.modele.Document;
import ca.cal.tp2.modele.Livre;

import java.util.List;

public interface DocumentRepository {

    void save(DVD dvd);
    void save(Livre livre);
    void save(CD cd);

    List<Document> findByTitre(String titre);
    List<Livre> findByAuteur(String auteur);
//    void findByAnnee(String annee);
    List<CD> findByArtiste(String artiste);
    List<DVD> findByDirector(String director);


}
