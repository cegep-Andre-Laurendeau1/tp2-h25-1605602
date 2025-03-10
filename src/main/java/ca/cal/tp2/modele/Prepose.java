package ca.cal.tp2.modele;


import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Access(AccessType.FIELD)
public class Prepose extends Utilisateur {

    @OneToMany
    private List<Document> documentList = new ArrayList<>();

    public Prepose() {
        super();
    }

    public List<Document> getDocumentList() {
        return documentList;
    }

    public void setDocumentList(List<Document> documentList) {
        this.documentList = documentList;
    }
}
