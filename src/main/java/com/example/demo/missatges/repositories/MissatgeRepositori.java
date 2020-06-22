package com.example.demo.missatges.repositories;

import com.example.demo.missatges.domain.Missatge;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MissatgeRepositori extends JpaRepository<Missatge, Integer> {
    List<Missatge> findAllByCodiConversaOrderByMessageIdAsc(@Param("codi_conversa") String codiConversa);
}
