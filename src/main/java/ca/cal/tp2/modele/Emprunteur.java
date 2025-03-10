package ca.cal.tp2.modele;


import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
//@Table(name="emprunteur")
@Access(AccessType.FIELD)
public class Emprunteur extends Utilisateur {

    @OneToMany
    private List<Amende> amendes = new ArrayList<Amende>();

    @OneToMany
    private List<Emprunt> emprunts = new ArrayList<Emprunt>();

    public Emprunteur() {
        super();
    }

    public List<Emprunt> getEmprunts() {
        return emprunts;
    }

    public void setEmprunts(List<Emprunt> emprunts) {
        this.emprunts = emprunts;
    }

    public List<Amende> getAmendes() {
        return amendes;
    }

    public void setAmendes(List<Amende> amendes) {
        this.amendes = amendes;
    }
}
