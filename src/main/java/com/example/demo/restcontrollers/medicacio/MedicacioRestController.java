package com.example.demo.restcontrollers.medicacio;

import com.example.demo.domain.medicacio.Medicacio;
import com.example.demo.repositories.MedicacioRepositori;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("/api/v1/medicacio")
public class MedicacioRestController {

    private MedicacioRepositori medicacioRepository;

    public MedicacioRestController(MedicacioRepositori medicacioRepository){
        this.medicacioRepository = medicacioRepository;
    }

    @GetMapping("/{franja}/{usuari}")
    public List<Medicacio> getMedicacioByFranjaHoraria(@PathVariable Integer franja, @PathVariable Integer usuari){
        return this.medicacioRepository.findAllByFranjaAndUsuari(franja, usuari);
    }

    @PostMapping
    public Medicacio saveMedicacio(@RequestBody Medicacio medicacio){
        return this.medicacioRepository.save(medicacio);
    }

    @DeleteMapping("/{id}")
    public void eliminarMedicacio(@PathVariable Integer id){
        this.medicacioRepository.deleteById(id);
    }

}
