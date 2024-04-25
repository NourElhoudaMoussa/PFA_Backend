package com.pfa.pfa_backend.Entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.security.core.GrantedAuthority;

import java.util.Collection;
import java.util.Date;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
//methode table par classe
    @Table(name="Citoyen")
public class Citoyen extends User{
    private String occupation;

    public Citoyen(String cin, String nom, String prenom, Date dn, String ln, String genre, String adr, String numTel, String email, String mdp, String occupation) {
        super(cin, nom, prenom, dn, ln, genre, adr, numTel, email, mdp);
        this.occupation = occupation;
    }


}
