package com.example.demo.repositories.registreSimptomes;

import com.example.demo.domain.registreSimptomes.Reestrenyiment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReestrenyimentRepositori extends JpaRepository<Reestrenyiment, Integer> {
    List<Reestrenyiment> findAllByUsuariOrderByDataDesc(@Param("usuari") Integer usuari);
}
