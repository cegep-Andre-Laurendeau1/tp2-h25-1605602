package ca.cal.tp2.persistence;

import ca.cal.tp2.modele.Emprunt;
import ca.cal.tp2.modele.Emprunteur;

import java.util.List;

public interface EmpruntRepository {

    void save(Emprunt emprunt);

    List<Emprunt> findByEmprunteur(Emprunteur emprunteur);


}
