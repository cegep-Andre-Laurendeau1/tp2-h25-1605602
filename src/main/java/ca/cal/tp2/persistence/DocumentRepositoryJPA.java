package ca.cal.tp2.persistence;

import ca.cal.tp2.modele.CD;
import ca.cal.tp2.modele.DVD;
import ca.cal.tp2.modele.Document;
import ca.cal.tp2.modele.Livre;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.NoResultException;
import jakarta.persistence.Persistence;

import java.util.List;

public class DocumentRepositoryJPA implements DocumentRepository {

    private EntityManager em;
    private final EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("tp2samuel.exe");

    @Override
    public void save(Livre livre) {
        try (EntityManager entityManager = entityManagerFactory.createEntityManager()) {
            entityManager.getTransaction().begin();
            entityManager.persist(livre);
            entityManager.getTransaction().commit();
        } catch (RuntimeException e) {
            throw new RuntimeException("Error saving Livre: " + e.getMessage());
        }
    }

    @Override
    public void save(DVD dvd) {
        try (EntityManager entityManager = entityManagerFactory.createEntityManager()) {
            entityManager.getTransaction().begin();
            entityManager.persist(dvd);
            entityManager.getTransaction().commit();
        } catch (RuntimeException e) {
            throw new RuntimeException("Error saving DVD: " + e.getMessage());
        }
    }

    @Override
    public void save(CD cd) {
        try (EntityManager entityManager = entityManagerFactory.createEntityManager()) {
            entityManager.getTransaction().begin();
            entityManager.persist(cd);
            entityManager.getTransaction().commit();
        } catch (RuntimeException e) {
            throw new RuntimeException("Error saving CD: " + e.getMessage());
        }
    }

    @Override
    public void save(Document document) {
        try (EntityManager entityManager = entityManagerFactory.createEntityManager()) {
            entityManager.getTransaction().begin();
            entityManager.persist(document);
            entityManager.getTransaction().commit();
        } catch (RuntimeException e) {
            throw new RuntimeException("Error saving Document: " + e.getMessage());
        }
    }


    @Override
    public List<Document> findByTitre(String titre) {
        try (EntityManager entityManager = entityManagerFactory.createEntityManager()) {
            return entityManager.createQuery("SELECT d FROM Document d WHERE d.titre = :titre", Document.class)
                    .setParameter("titre", titre)
                    .getResultList();
        } catch (NoResultException e) {
            return List.of();  // Retourne une liste vide au lieu de null
        }
    }


    @Override
    public List<Livre> findByAuteur(String auteur) {
        try (EntityManager entityManager = entityManagerFactory.createEntityManager()) {
            return entityManager.createQuery("SELECT l FROM Livre l WHERE l.auteur LIKE :auteur", Livre.class)
                    .setParameter("auteur", "%" + auteur + "%")
                    .getResultList();
        } catch (NoResultException e) {
            return List.of();
        }
    }

    @Override
    public List<CD> findByArtiste(String artiste) {
        try (EntityManager entityManager = entityManagerFactory.createEntityManager()) {
            return entityManager.createQuery("SELECT c FROM CD c WHERE c.artiste LIKE :artiste", CD.class)
                    .setParameter("artiste", "%" + artiste + "%")
                    .getResultList();
        } catch (NoResultException e) {
            return List.of();
        }
    }

    @Override
    public List<DVD> findByDirector(String director) {
        try (EntityManager entityManager = entityManagerFactory.createEntityManager()) {
            return entityManager.createQuery("SELECT d FROM DVD d WHERE d.director LIKE :director", DVD.class)
                    .setParameter("director", "%" + director + "%")
                    .getResultList();
        } catch (NoResultException e) {
            return List.of();
        }
    }



}
