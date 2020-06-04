package com.example.demo.repositories.signesVitals;

import com.example.demo.domain.signesvitals.SignesVitals;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SignesVitalsRepositori extends JpaRepository<SignesVitals, Integer> {
    List<SignesVitals> findAllByUsuariOrderByDataDesc(@Param("usuari") Integer usuari);
    List<SignesVitals> findAllByUsuariOrderByDataAsc(@Param("usuari") Integer usuari);
}
