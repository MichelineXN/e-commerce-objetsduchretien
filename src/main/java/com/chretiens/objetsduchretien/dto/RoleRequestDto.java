package com.chretiens.objetsduchretien.dto;

public class RoleRequestDto {


    private int id ;
    private String nameRole ;

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

    public RoleRequestDto(int id, String nameRole) {
        this.id = id;
        this.nameRole = nameRole;


    }
}
