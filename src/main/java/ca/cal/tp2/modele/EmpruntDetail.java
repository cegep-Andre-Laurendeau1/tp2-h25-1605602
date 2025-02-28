package tp1.modele;


import lombok.Data;

import java.util.Date;

@Data
public class EmpruntDetail {

    private Long id;
    private Date dateRetourPrevue;
    private Date dateRetourActuelle;
    private String status;



}
