package com.example.demo.restcontrollers.registre;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/dades")
public class DadesRegistrades {


    @GetMapping("/{userId}")
    public void getAllInfo(@PathVariable String userId){

    }

}
