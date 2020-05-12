package com.example.demo.repositories;

import com.example.demo.domain.nutricio.Nutricio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NutricioRepositori extends JpaRepository<Nutricio, Integer> {
    List<Nutricio> findAllByUsuari(@Param("usuari") Integer usuari);
}
