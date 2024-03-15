package com.chretiens.objetsduchretien.domain;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;


@Entity
public class Commande {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    private String name;
    private String userCommande;
    private Date dateCommande;
    private String detailsCommande;
    private String status;
    private int total;
    private String adresse;


    @ManyToOne
    private User user;

    @ManyToMany
    @JoinTable(
            name = "commande_product",
            joinColumns = @JoinColumn(name = "commande_id"),
            inverseJoinColumns = @JoinColumn(name = "product_id")
    )
    private List<Product> products;


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

    public String getUserCommande() {
        return userCommande;
    }

    public void setUserCommande(String userCommande) {
        this.userCommande = userCommande;
    }

    public Date getDateCommande() {
        return dateCommande;
    }

    public void setDateCommande(Date dateCommande) {
        this.dateCommande = dateCommande;
    }

    public String getDetailsCommande() {
        return detailsCommande;
    }

    public void setDetailsCommande(String detailsCommande) {
        this.detailsCommande = detailsCommande;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public Commande() {

    }

    public Commande(int id, String name, String userCommande, Date dateCommande, String detailsCommande, String status, int total, String adresse, User user, List<Product> products) {
        this.id = id;
        this.name = name;
        this.userCommande = userCommande;
        this.dateCommande = dateCommande;
        this.detailsCommande = detailsCommande;
        this.status = status;
        this.total = total;
        this.adresse = adresse;
        this.user = user;
        this.products = products;
    }
}
