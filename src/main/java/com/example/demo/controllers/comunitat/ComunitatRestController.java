package com.example.demo.controllers.comunitat;

import com.example.demo.domain.comunitat.Esdeveniment;
import com.example.demo.repositories.EsdevenimentRepositori;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/comunitat")
public class ComunitatRestController {
    private EsdevenimentRepositori eventComunitatRepository;

    public ComunitatRestController(EsdevenimentRepositori eventComunitatRepository){
        this.eventComunitatRepository = eventComunitatRepository;
    }

    @GetMapping("/events")
    public List<Esdeveniment> findAll(){
        return this.eventComunitatRepository.findAll();
    }
}
