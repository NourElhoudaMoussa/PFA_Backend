package com.pfa.pfa_backend.Entity;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@Entity

@NoArgsConstructor
//methode table par classe
@Table(name="ResponsableService")
public class ResponsableService extends Responsable {
    public ResponsableService(String cin, String nom, String prenom, Date dn, String ln, String genre, String adr, String numTel, String email, String mdp) {
        super(cin, nom, prenom, dn, ln, genre, adr, numTel, email, mdp);
    }
}
