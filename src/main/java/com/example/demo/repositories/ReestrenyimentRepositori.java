package com.example.demo.repositories;

import com.example.demo.domain.registre_simptomes.Reestrenyiment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReestrenyimentRepositori extends JpaRepository<Reestrenyiment, Integer> {
    List<Reestrenyiment> findAllByUsuari(@Param("usuari") Integer usuari);
}
