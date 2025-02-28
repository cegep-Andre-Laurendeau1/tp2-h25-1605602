package ca.cal.tp2.service.dto;

import ca.cal.tp2.modele.Document;

public record DocumentDTO(Long id, String titre, int nombreExemplaires) {

    public static DocumentDTO toDTO(Document document) {
        return new DocumentDTO(document.getId(), document.getTitre(), document.getNombreExemplaires());
    }


}
