package com.example.demo.repositories.medicacio;

import com.example.demo.domain.medicacio.Medicacio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MedicacioRepositori extends JpaRepository<Medicacio, Integer> {
    List<Medicacio> findAllByUsuari(@Param("usuari") Integer usuari);
    List<Medicacio> findAllByFranjaAndUsuari (@Param("franja") Integer franja, @Param("usuari") Integer usuari );
}
