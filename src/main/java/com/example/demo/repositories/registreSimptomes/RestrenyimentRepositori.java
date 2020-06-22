package com.example.demo.repositories.registreSimptomes;

import com.example.demo.domain.registreSimptomes.Restrenyiment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RestrenyimentRepositori extends JpaRepository<Restrenyiment, Integer> {
    List<Restrenyiment> findAllByUsuariOrderByDataDesc(@Param("usuari") Integer usuari);
}
