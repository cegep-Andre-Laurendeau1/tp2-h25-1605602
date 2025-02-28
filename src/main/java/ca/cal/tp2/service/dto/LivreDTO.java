package ca.cal.tp2.service.dto;

import ca.cal.tp2.modele.Livre;

public record LivreDTO(Long id, String titre, int nombreExemplaires, String ISBN, String auteur, String editeur, int nombrePages ) {

    public static LivreDTO toDTO(Livre livre) {
        return new LivreDTO(livre.getId(), livre.getTitre(), livre.getNombreExemplaires(), livre.getISBN(), livre.getAuteur(), livre.getEditeur(), livre.getNombrePages());
    }

}
