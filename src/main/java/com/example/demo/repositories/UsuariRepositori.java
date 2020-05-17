package com.example.demo.repositories;

import com.example.demo.domain.usuaris.Usuari;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UsuariRepositori extends JpaRepository<Usuari, Integer> {
    Usuari findByCorreuElectronic(@Param("correuElectronic") String correuElectronic);
    Usuari findFirstById(@Param("id") Integer id);
}
