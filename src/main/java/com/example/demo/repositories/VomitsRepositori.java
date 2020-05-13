package com.example.demo.repositories;

import com.example.demo.domain.registre_simptomes.Vomits;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VomitsRepositori extends JpaRepository<Vomits, Integer> {
    List<Vomits> findAllByUsuari(@Param("usuari") Integer usuari);
}
