package ca.cal.tp2.modele;

import jakarta.persistence.Access;
import jakarta.persistence.AccessType;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table
@Access(AccessType.FIELD)
public class Livre extends Document {

    private String ISBN;
    private String auteur;
    private String editeur;
    private int nombrePages;

    public Livre() {}

    public Livre(String titre, int nombreExemplaires, String ISBN, String auteur, String editeur, int nombrePages) {
        super(titre, nombreExemplaires);
        this.ISBN = ISBN;
        this.auteur = auteur;
        this.editeur = editeur;
        this.nombrePages = nombrePages;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public String getEditeur() {
        return editeur;
    }

    public void setEditeur(String editeur) {
        this.editeur = editeur;
    }

    public int getNombrePages() {
        return nombrePages;
    }

    public void setNombrePages(int nombrePages) {
        this.nombrePages = nombrePages;
    }
}
