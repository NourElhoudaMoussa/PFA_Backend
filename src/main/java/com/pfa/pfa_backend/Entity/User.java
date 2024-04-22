package com.pfa.pfa_backend.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public abstract class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String cin;
    private String nom;
    private String prenom;
    private Date dn;
    private String ln;
    private String genre;
    private String adr;
    private String numTel;
    private String email;
    private String mdp;


    public User(String cin, String nom, String prenom, Date dn, String ln, String genre, String adr, String numTel, String email, String mdp) {
        this.cin = cin;
        this.nom = nom;
        this.prenom = prenom;
        this.dn = dn;
        this.ln = ln;
        this.genre = genre;
        this.adr = adr;
        this.numTel = numTel;
        this.email = email;
        this.mdp = mdp;
    }
}
