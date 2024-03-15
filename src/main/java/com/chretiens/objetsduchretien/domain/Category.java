package com.chretiens.objetsduchretien.domain;


import jakarta.persistence.*;

import java.util.List;


@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    private String name ;

    private String livre ;
    private String theeShirt ;
    private String pendentif ;
    private String  casquette;
    private String  chapeau;
    private String drapeau ;
    private String sac ;
    private String divers;
    private String description ;



    @ManyToMany
    private List<Product>products;

    public List<Product> getProducts() {
        return products;


    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

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

    public String getLivre() {
        return livre;
    }

    public void setLivre(String livre) {
        this.livre = livre;
    }

    public String getTheeShirt() {
        return theeShirt;
    }

    public void setTheeShirt(String theeShirt) {
        this.theeShirt = theeShirt;
    }

    public String getPendentif() {
        return pendentif;
    }

    public void setPendentif(String pendentif) {
        this.pendentif = pendentif;
    }

    public String getCasquette() {
        return casquette;
    }

    public void setCasquette(String casquette) {
        this.casquette = casquette;
    }

    public String getChapeau() {
        return chapeau;
    }

    public void setChapeau(String chapeau) {
        this.chapeau = chapeau;
    }

    public String getDrapeau() {
        return drapeau;
    }

    public void setDrapeau(String drapeau) {
        this.drapeau = drapeau;
    }

    public String getSac() {
        return sac;
    }

    public void setSac(String sac) {
        this.sac = sac;
    }

    public String getDivers() {
        return divers;
    }

    public void setDivers(String divers) {
        this.divers = divers;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Category(int id, String name, String livre, String theeShirt, String pendentif, String casquette,
                    String chapeau, String drapeau, String sac, String divers, String description) {
        this.id = id;
        this.name = name;
        this.livre = livre;
        this.theeShirt = theeShirt;
        this.pendentif = pendentif;
        this.casquette = casquette;
        this.chapeau = chapeau;
        this.drapeau = drapeau;
        this.sac = sac;
        this.divers = divers;
        this.description = description;


    }

    public Category() {

    }

}
