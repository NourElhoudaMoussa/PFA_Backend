package com.pfa.pfa_backend.Entity;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@Entity

@NoArgsConstructor
//methode table par classe
    @Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public abstract class Responsable extends User{

    public Responsable(String cin, String nom, String prenom, Date dn, String ln, String genre, String adr, String numTel, String email, String mdp) {
        super(cin, nom, prenom, dn, ln, genre, adr, numTel, email, mdp);
    }


}
