package com.pfa.pfa_backend.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@Entity

@NoArgsConstructor
//methode table par classe
@Table(name="ResponsableGeneral")
public class ResponsableGeneral extends Responsable {
    @OneToOne
    private Municipal municipal;

    public ResponsableGeneral(String cin, String nom, String prenom, Date dn, String ln, String genre, String adr, String numTel, String email, String mdp, Municipal municipal) {
        super(cin, nom, prenom, dn, ln, genre, adr, numTel, email, mdp);
        this.municipal = municipal;
    }



}
