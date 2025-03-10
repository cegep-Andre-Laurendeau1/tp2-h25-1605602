package ca.cal.tp2.modele;


import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="amende")
@Access(AccessType.FIELD)
public class Amende {


    @Id
    @GeneratedValue
    private Long id;

    private double montant;
    private Date dateCreation;
    private boolean status;

    @ManyToOne
    @JoinColumn
    private Emprunteur emprunteur;

    public Amende(double montant, Date dateCreation, boolean status) {
        this.montant = montant;
        this.dateCreation = dateCreation;
        this.status = status;
    }

    public Amende() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Emprunteur getEmprunteur() {
        return emprunteur;
    }

    public void setEmprunteur(Emprunteur emprunteur) {
        this.emprunteur = emprunteur;
    }
}
