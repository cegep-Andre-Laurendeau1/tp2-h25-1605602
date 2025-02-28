package tp1.modele;


import lombok.Data;

@Data
public abstract class  Utilisateur {

    private int userID;
    private String name;
    private String email;
    private String phoneNumber;



}
