package com.example.demo.repositories;

import com.example.demo.domain.registre_simptomes.CanvisBucals;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CanvisBucalsRepositori extends JpaRepository<CanvisBucals, Integer> {
    List<CanvisBucals> findAllByUsuari(@Param("usuari") Integer usuari);
}
