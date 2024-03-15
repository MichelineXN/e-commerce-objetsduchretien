package com.chretiens.objetsduchretien.dto;

import java.util.Date;

public class CommandeRequestDto {


    private int id;
    private String user;
    private Date dateCommande;
    private String detailsCommande;
    private String status;
    private int total;
    private String adresse;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
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

    public CommandeRequestDto(int id, String user, Date dateCommande, String detailsCommande, String status, int total, String adresse) {
        this.id = id;
        this.user = user;
        this.dateCommande = dateCommande;
        this.detailsCommande = detailsCommande;
        this.status = status;
        this.total = total;
        this.adresse = adresse;


    }
}
