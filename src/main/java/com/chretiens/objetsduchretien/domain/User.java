package com.chretiens.objetsduchretien.domain;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;


@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    private String name;
    private String firstname;
    private int email;
    private String Password;
    private Date dateInscription;


    public User() {

    }


    @ManyToMany
    private List<Role> roles;

    @OneToMany(mappedBy = "user")
    private List<Commande> commandes;

    @ManyToOne
    private Panier panier;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public int getEmail() {
        return email;
    }

    public void setEmail(int email) {
        this.email = email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public Date getDateInscription() {
        return dateInscription;
    }

    public void setDateInscription(Date dateInscription) {
        this.dateInscription = dateInscription;
    }

    public User(int id, String name, String firstname, int email, String password, Date dateInscription) {
        this.id = id;
        this.name = name;
        this.firstname = firstname;
        this.email = email;
        Password = password;
        this.dateInscription = dateInscription;



    }
}
