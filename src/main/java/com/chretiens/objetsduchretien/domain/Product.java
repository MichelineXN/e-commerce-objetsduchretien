package com.chretiens.objetsduchretien.domain;


import jakarta.persistence.*;

import java.util.List;

@Entity
public class Product {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id ;
    private String name ;
    private String description;
    private int price;
    private int quantiteStock;
    private String categorie ;


@ManyToMany(mappedBy = "category")

    private List<Category> categories;


    @ManyToMany(mappedBy = "products")
    private List<Commande> commandes;
    @ManyToOne
    private Category category;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantiteStock() {
        return quantiteStock;
    }

    public void setQuantiteStock(int quantiteStock) {
        this.quantiteStock = quantiteStock;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    public Product(int id, String name, String description, int price, int quantiteStock, String categorie) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantiteStock = quantiteStock;
        this.categorie = categorie;

    }

    public Product() {

    }


    public void setName(String name) {
    }
}

