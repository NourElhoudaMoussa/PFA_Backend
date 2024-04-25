package com.pfa.pfa_backend.Entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public abstract class User implements UserDetails {
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
    private Role role;


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
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of(new SimpleGrantedAuthority(role.name()));
    }

    @Override
    public String getPassword() {
        return mdp;
    }

    @Override
    public String getUsername() {
        return email;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
