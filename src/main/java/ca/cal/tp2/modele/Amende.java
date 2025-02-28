package ca.cal.tp2.modele;


import lombok.Data;

import java.util.Date;

@Data
public class Amende {

    private Long id;
    private double montant;
    private Date dateCreation;
    private boolean status;



}
