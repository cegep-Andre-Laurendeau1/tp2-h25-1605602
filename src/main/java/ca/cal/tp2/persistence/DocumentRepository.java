package ca.cal.tp2.persistence;

import ca.cal.tp2.modele.CD;
import ca.cal.tp2.modele.DVD;
import ca.cal.tp2.modele.Document;
import ca.cal.tp2.modele.Livre;

public interface DocumentRepository {

    void save(DVD dvd);
    void save(Livre livre);
    void save(CD cd);

    Document findByTitre(String titre);
    Livre findByAuteur(String auteur);
//    void findByAnnee(String annee);
    CD findByArtiste(String artiste);
    DVD findByDirector(String director);


}
