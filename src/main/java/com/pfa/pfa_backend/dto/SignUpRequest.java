package com.pfa.pfa_backend.dto;

import lombok.Data;


import java.util.Date;
@Data
public class SignUpRequest {

    private String cin;
    private String nom;
    private String prenom;
    private Date dn;
    private String ln;
    private String adr;
    private String numTel;
    private String mdp;

}
