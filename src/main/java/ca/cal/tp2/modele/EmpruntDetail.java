package ca.cal.tp2.modele;


import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;


@Entity
@Table
@Access(AccessType.FIELD)
public class EmpruntDetail {

    @Id
    @GeneratedValue
    private Long id;

    private Date dateRetourPrevue;
    private Date dateRetourActuelle;
    private String status;

    @ManyToOne
    private Emprunt emprunt;

    @ManyToOne
    private Document document;

    public EmpruntDetail(Date dateRetourPrevue, Date dateRetourActuelle, String status) {
        this.dateRetourPrevue = dateRetourPrevue;
        this.dateRetourActuelle = dateRetourActuelle;
        this.status = status;
    }

    public EmpruntDetail() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDateRetourPrevue() {
        return dateRetourPrevue;
    }

    public void setDateRetourPrevue(Date dateRetourPrevue) {
        this.dateRetourPrevue = dateRetourPrevue;
    }

    public Date getDateRetourActuelle() {
        return dateRetourActuelle;
    }

    public void setDateRetourActuelle(Date dateRetourActuelle) {
        this.dateRetourActuelle = dateRetourActuelle;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Emprunt getEmprunt() {
        return emprunt;
    }

    public void setEmprunt(Emprunt emprunt) {
        this.emprunt = emprunt;
    }

    public Document getDocument() {
        return document;
    }

    public void setDocument(Document document) {
        this.document = document;
    }
}

