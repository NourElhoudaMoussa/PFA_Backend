package com.pfa.pfa_backend.Entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Municipal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String region;
    private String nom;
    private String adr;
    private String tel;
    private String fax;


    public Municipal(String region, String nom, String adr, String tel, String fax) {
        this.region = region;
        this.nom = nom;
        this.adr = adr;
        this.tel = tel;
        this.fax = fax;
    }



}
