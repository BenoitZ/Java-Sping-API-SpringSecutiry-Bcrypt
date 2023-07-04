package com.controller;

import com.modele.Users;
import com.service.UsersService;
import lombok.AllArgsConstructor;

import java.util.List;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@AllArgsConstructor
public class UsersController {

    private final UsersService usersService;

    @GetMapping("/read")
    public List<Users> read() {
        return usersService.lire();
    }

    @PostMapping("/create")
    public Users create(@RequestBody Users users) {
        return usersService.creer(users);
    }

    @PutMapping("/update/{id}")
    public Users update(@PathVariable Long id, @RequestBody Users users) {
        return usersService.modifier(id, users);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        return usersService.supprimer(id);
    }

}
