package tp1.service;

import tp1.modele.Livre;
import tp1.persistence.LivreRepository;

public class LivreService {

    private final LivreRepository livreRepository;

    public LivreService(LivreRepository livreRepository) {
        this.livreRepository = livreRepository;
    }

    public void ajouteLivre(String ISBN, String auteur, String editeur, int nombrePages) {
        livreRepository.saveLivre(new Livre(ISBN, auteur, editeur, nombrePages));
    }

    public Livre getLivre(String ISBN) {
        return livreRepository.getLivre(ISBN);
    }


}
