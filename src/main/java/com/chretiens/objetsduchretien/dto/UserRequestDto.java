package com.chretiens.objetsduchretien.dto;

import java.util.Date;

public class UserRequestDto {
    private int id;
    private String name;
    private String firstname;
    private int email;
    private String Password;
    private Date dateInscription;

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

    public UserRequestDto(int id, String name, String firstname, int email, String password, Date dateInscription) {
        this.id = id;
        this.name = name;
        this.firstname = firstname;
        this.email = email;
        Password = password;
        this.dateInscription = dateInscription;



    }
}
