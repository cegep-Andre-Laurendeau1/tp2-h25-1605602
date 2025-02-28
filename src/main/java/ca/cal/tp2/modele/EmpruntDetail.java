package tp1.modele;


import lombok.Data;

import java.util.Date;

@Data
public class EmpruntDetail {

    private int lineItemID;
    private Date dateRetourPrevue;
    private Date dateRetourActuelle;
    private String status;


}
