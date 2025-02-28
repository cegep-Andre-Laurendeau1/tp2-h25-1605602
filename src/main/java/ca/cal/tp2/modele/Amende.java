package tp1.modele;


import lombok.Data;

import java.util.Date;

@Data
public class Amende {

    private int fineID;
    private double montant;
    private Date dateCreation;
    private boolean status;



}
