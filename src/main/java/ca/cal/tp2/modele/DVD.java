package ca.cal.tp2.modele;

import jakarta.persistence.Access;
import jakarta.persistence.AccessType;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="dvd")
@Access(AccessType.FIELD)
public class DVD extends Document {

    private String director;
    private int duree;
    private String genre;

    public DVD() {
    }

    public DVD(String titre, int nombreExemplaires, String director, int duree, String genre) {
        super(titre, nombreExemplaires);
        this.director = director;
        this.duree = duree;
        this.genre = genre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getDuree() {
        return duree;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
