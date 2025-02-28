package ca.cal.tp2.persistence;

import ca.cal.tp2.modele.CD;
import ca.cal.tp2.modele.DVD;
import ca.cal.tp2.modele.Document;
import ca.cal.tp2.modele.Livre;
import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;

import java.util.List;

public class DocumentRepositoryJPA implements DocumentRepository {

    private EntityManager em;


    @Override
    public void save(DVD dvd) {
        em.getTransaction().begin();
        em.persist(dvd);
        em.getTransaction().commit();
    }

    @Override
    public void save(Livre livre) {
        em.getTransaction().begin();
        em.persist(livre);
        em.getTransaction().commit();
    }

    @Override
    public void save(CD cd) {
        em.getTransaction().begin();
        em.persist(cd);
        em.getTransaction().commit();
    }

    @Override
    public List<Document> findByTitre(String titre) {
        return em.createQuery("SELECT d FROM Document d WHERE d.titre LIKE :titre", Document.class)
                .setParameter("titre", "%" + titre + "%")
                .getResultList();
    }

    @Override
    public List<Livre> findByAuteur(String auteur) {
        return em.createQuery("SELECT l FROM Livre l WHERE l.auteur LIKE :auteur", Livre.class)
                .setParameter("auteur", "%" + auteur + "%")
                .getResultList();
    }

    @Override
    public List<CD> findByArtiste(String artiste) {
        return em.createQuery("SELECT c FROM CD c WHERE c.artiste LIKE :artiste", CD.class)
                .setParameter("artiste", "%" + artiste + "%")
                .getResultList();
    }

    @Override
    public List<DVD> findByDirector(String director) {
        return em.createQuery("SELECT d FROM DVD d WHERE d.director LIKE :director", DVD.class)
                .setParameter("director", "%" + director + "%")
                .getResultList();
    }



}
