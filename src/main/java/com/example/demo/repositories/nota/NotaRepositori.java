package com.example.demo.repositories.nota;

import com.example.demo.domain.nota.Nota;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NotaRepositori extends JpaRepository<Nota, Integer> {
    List<Nota> findAllByUsuari(@Param("usuari") Integer usuari);
}
