package com.WILAND.Pruebas.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.WILAND.Pruebas.entity.Users;


public interface UsersRepository extends JpaRepository<Users, Long>{

    Optional<Users> findByName(String name);
}
