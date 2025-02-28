package tp1.modele;

import lombok.Data;

@Data
public abstract class Document {
    protected Long id;
    protected String titre;
    protected int nombreExemplaires;




}