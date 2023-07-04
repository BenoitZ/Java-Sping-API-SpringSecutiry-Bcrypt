package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.modele.Users;

public interface UsersRepository extends JpaRepository<Users, Long> {

}
