package ca.cal.tp2.modele;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table
@Access(AccessType.FIELD)
public abstract class Document {

    @Id
    @GeneratedValue
    protected Long id;

    protected String titre;
    protected int nombreExemplaires;

    @OneToMany
    protected List<EmpruntDetail> empruntDetailList = new ArrayList<>();

    @ManyToOne
    protected Prepose prepose;

    public Document(String titre, int nombreExemplaires) {
        this.titre = titre;
        this.nombreExemplaires = nombreExemplaires;

    }

    public Document() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public int getNombreExemplaires() {
        return nombreExemplaires;
    }

    public void setNombreExemplaires(int nombreExemplaires) {
        this.nombreExemplaires = nombreExemplaires;
    }

    public List<EmpruntDetail> getEmpruntDetailList() {
        return empruntDetailList;
    }

    public void setEmpruntDetailList(List<EmpruntDetail> empruntDetailList) {
        this.empruntDetailList = empruntDetailList;
    }

    public Prepose getPrepose() {
        return prepose;
    }

    public void setPrepose(Prepose prepose) {
        this.prepose = prepose;
    }
}