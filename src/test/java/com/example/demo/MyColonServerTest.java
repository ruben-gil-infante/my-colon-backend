package com.example.demo;

import com.example.demo.domain.usuaris.Usuari;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.*;

import java.util.Date;

@AutoConfigureMockMvc
@RunWith(SpringRunner.class)
@SpringBootTest
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class MyColonServerTest {

    @Autowired
    private MockMvc mockMvc;
    private Usuari usuari;

    private Date dataAuxiliar = new Date();


    @BeforeAll
    void setUp()throws Exception{
    }


    // Esdeveniment
    @Test
    void guardarEliminarEsdeveniment() throws Exception {

    }

    // Medicacions
    @Test
    void guardarEliminarMedicacioMati(){

    }

    @Test
    void guardarEliminarMedicacioTarda(){

    }

    @Test
    void guardarEliminarMedicacioNit(){

    }

    // Nota
    @Test
    void guardarEliminarNota(){

    }


    // Nutricio
    @Test
    void guardarEliminarNutricio(){

    }

    // Canvis bucals
    @Test
    void guardarEliminarCanvisBucals(){

    }

    // Diarrees
    void guardarEliminarDiarrees(){

    }

    // Dolor
    void guardarEliminarDolor(){

    }

    // Fatiga
    @Test
    void guardarEliminarFatiga(){

    }

    // Restrenyiment
    @Test
    void guardarEliminarRestrenyiment(){

    }

    //Vomits
    @Test
    void guardarEliminarVomits(){

    }

    // Signes vitals
    @Test
    void guardarEliminarSignesVitals(){

    }


    @AfterAll
    void cleanDB(){

    }

    public static String asJsonString(final Object obj) {
        try {
            return new ObjectMapper().writeValueAsString(obj);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}

