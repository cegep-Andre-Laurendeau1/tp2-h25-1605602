package tp1.modele;


import lombok.Data;

@Data
public abstract class  Utilisateur {

    protected Long id;
    protected String name;
    protected String email;
    protected String phoneNumber;



}
