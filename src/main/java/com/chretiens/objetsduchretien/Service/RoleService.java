package com.chretiens.objetsduchretien.Service;

import com.chretiens.objetsduchretien.domain.Category;
import com.chretiens.objetsduchretien.domain.Role;

public interface RoleService {


    Role add(String nameRole, String name);

    Role findById(int id);
}
