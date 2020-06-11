package com.example.demo.messages.repositories;

import com.example.demo.messages.domain.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MessageRepositori extends JpaRepository<Message, Integer> {
    List<Message> findAllByCodiConversaOrderByMessageIdAsc(@Param("codi_conversa") String codiConversa);

}
