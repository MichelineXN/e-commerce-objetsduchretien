package com.chretiens.objetsduchretien.Service;

import com.chretiens.objetsduchretien.domain.Category;
import com.chretiens.objetsduchretien.domain.Product;
import com.chretiens.objetsduchretien.domain.User;

import java.util.Date;

public interface UserService {

    User add(String name);

    User add(String name, Date dateInscription);

    User findById(int id);
}
