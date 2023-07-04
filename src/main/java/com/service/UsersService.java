package com.service;

import java.util.List;

import com.modele.Users;

public interface UsersService {

    Users creer(Users users); // create

    List<Users> lire(); // read

    Users modifier(Long id, Users users); // Update

    String supprimer(Long id); // delete

}
