package com.chretiens.objetsduchretien.domain;

import jakarta.persistence.*;

import java.util.List;


@Entity
public class Role {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id ;
    private String nameRole ;

    @ManyToMany(mappedBy = "roles")
    private List<User> users;

    public Role(int id, String nameRole) {
        this.id = id;
        this.nameRole = nameRole;

    }

    public Role() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameRole() {
        return nameRole;
    }

    public void setNameRole(String nameRole) {
        this.nameRole = nameRole;
    }

}
