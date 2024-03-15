package com.chretiens.objetsduchretien.domain;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;


@Entity
public class Panier {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    private String userName;
    private String product;
    private int montant;
    private String quantite;
    private String commandeNum;
    private int  paiement;
    private Date datePaiement;
    private String typePaiement;
    private String statusPaiement;

    @ManyToMany
    private List<Product> products;

    @ManyToOne
    private User user;

    public Panier(int id, String userName, String product, int montant, String quantite,
                  String commandeNum, int paiement, Date datePaiement, String typePaiement, String statusPaiement) {
        this.id = id;
        this.userName = userName;
        this.product = product;
        this.montant = montant;
        this.quantite = quantite;
        this.commandeNum = commandeNum;
        this.paiement = paiement;
        this.datePaiement = datePaiement;
        this.typePaiement = typePaiement;
        this.statusPaiement = statusPaiement;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public int getMontant() {
        return montant;
    }

    public void setMontant(int montant) {
        this.montant = montant;
    }

    public String getQuantite() {
        return quantite;
    }

    public void setQuantite(String quantite) {
        this.quantite = quantite;
    }

    public String getCommandeNum() {
        return commandeNum;
    }

    public void setCommandeNum(String commandeNum) {
        this.commandeNum = commandeNum;
    }

    public int getPaiement() {
        return paiement;
    }

    public void setPaiement(int paiement) {
        this.paiement = paiement;
    }

    public Date getDatePaiement() {
        return datePaiement;
    }

    public void setDatePaiement(Date datePaiement) {
        this.datePaiement = datePaiement;
    }

    public String getTypePaiement() {
        return typePaiement;
    }

    public void setTypePaiement(String typePaiement) {
        this.typePaiement = typePaiement;
    }

    public String getStatusPaiement() {
        return statusPaiement;
    }

    public void setStatusPaiement(String statusPaiement) {
        this.statusPaiement = statusPaiement;
    }

    public Panier() {

    }

    }


