package com.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.modele.Users;
import com.repository.UsersRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UsersServiceImpl implements UsersService {

    private final UsersRepository usersRepository;

    @Override
    public Users creer(Users users) {
        return usersRepository.save(users);
    }

    @Override
    public List<Users> lire() {
        return usersRepository.findAll();
    }

    @Override
    public Users modifier(Long id, Users users) {
        return usersRepository.findById(id)
                .map(p -> {
                    p.setEmail(users.getEmail());
                    p.setPassword(users.getPassword());
                    p.setConfirmPassword(users.getConfirmPassword());
                    return usersRepository.save(p);
                }).orElseThrow(() -> new RuntimeException("Utilisateur non trouvé."));
    }

    @Override
    public String supprimer(Long id) {
        usersRepository.deleteById(id);
        return "Utilisateur supprimé.";
    }

}
