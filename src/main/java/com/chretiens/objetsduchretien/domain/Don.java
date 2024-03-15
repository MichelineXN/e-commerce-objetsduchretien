package com.chretiens.objetsduchretien.domain;

import jakarta.persistence.*;

import java.util.Date;



@Entity
public class Don {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id ;
    private String nameDonateur ;

    // Pour envoyer des reçus et des remerciements
    private String emailDonateur ;
    private int montant;
    private Date dateDon;
    private String objetDon ;

    @ManyToOne
    private User user;




    public Don() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameDonateur() {
        return nameDonateur;
    }

    public void setNameDonateur(String nameDonateur) {
        this.nameDonateur = nameDonateur;
    }

    public String getEmailDonateur() {
        return emailDonateur;
    }

    public void setEmailDonateur(String emailDonateur) {
        this.emailDonateur = emailDonateur;
    }

    public int getMontant() {
        return montant;
    }

    public void setMontant(int montant) {
        this.montant = montant;
    }

    public Date getDateDon() {
        return dateDon;
    }

    public void setDateDon(Date dateDon) {
        this.dateDon = dateDon;
    }

    public String getObjetDon() {
        return objetDon;
    }

    public void setObjetDon(String objetDon) {
        this.objetDon = objetDon;
    }

    public Don(int id, String nameDonateur, String emailDonateur, int montant, Date dateDon, String objetDon) {
        this.id = id;
        this.nameDonateur = nameDonateur;
        this.emailDonateur = emailDonateur;
        this.montant = montant;
        this.dateDon = dateDon;
        this.objetDon = objetDon;


    }

    public void setDon(String name) {
    }
}
