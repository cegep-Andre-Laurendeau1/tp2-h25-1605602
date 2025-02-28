package ca.cal.tp2.modele;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table
@Access(AccessType.FIELD)
public class Emprunt {

    @Id
    @GeneratedValue
    private Long id;

    private Date dateEmprunt;
    private String status;

    @ManyToOne
    private Emprunteur emprunteur;

    @OneToMany
    private List<EmpruntDetail> empruntDetailList = new ArrayList<EmpruntDetail>();

    public Emprunt() {}

    public Emprunt(Date dateEmprunt, String status) {
        this.dateEmprunt = dateEmprunt;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDateEmprunt() {
        return dateEmprunt;
    }

    public void setDateEmprunt(Date dateEmprunt) {
        this.dateEmprunt = dateEmprunt;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Emprunteur getEmprunteur() {
        return emprunteur;
    }

    public void setEmprunteur(Emprunteur emprunteur) {
        this.emprunteur = emprunteur;
    }

    public List<EmpruntDetail> getEmpruntDetailList() {
        return empruntDetailList;
    }

    public void setEmpruntDetailList(List<EmpruntDetail> empruntDetailList) {
        this.empruntDetailList = empruntDetailList;
    }
}
