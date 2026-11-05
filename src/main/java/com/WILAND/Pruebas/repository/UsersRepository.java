package com.WILAND.Pruebas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.WILAND.Pruebas.entity.Users;

public interface UsersRepository extends JpaRepository<Users, Long>{

}
