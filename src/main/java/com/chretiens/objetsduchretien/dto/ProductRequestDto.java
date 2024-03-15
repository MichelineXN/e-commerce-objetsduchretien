package com.chretiens.objetsduchretien.dto;

public class ProductRequestDto {

    private int id ;
    private String name ;
    private String description;
    private int price;
    private int quantiteStock;
    private String categorie ;

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

    public ProductRequestDto(int id, String name, String description, int price, int quantiteStock, String categorie) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantiteStock = quantiteStock;
        this.categorie = categorie;


    }
}
