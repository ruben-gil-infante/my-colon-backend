package com.example.demo.repositories.comunitat;

import com.example.demo.domain.comunitat.Esdeveniment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EsdevenimentRepositori extends JpaRepository<Esdeveniment, Integer> {

}
