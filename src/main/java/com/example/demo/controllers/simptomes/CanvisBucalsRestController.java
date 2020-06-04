package com.example.demo.controllers.simptomes;

import com.example.demo.domain.registreSimptomes.CanvisBucals;
import com.example.demo.repositories.registreSimptomes.CanvisBucalsRepositori;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/canvisbucals")
public class CanvisBucalsRestController {
    private CanvisBucalsRepositori canvisBucalsRepositori;

    public CanvisBucalsRestController(CanvisBucalsRepositori canvisBucalsRepositori){
        this.canvisBucalsRepositori = canvisBucalsRepositori;
    }

    @GetMapping("/{usuari}")
    public List<CanvisBucals> getAllCanvisBucalsByUsuari(@PathVariable Integer usuari){
        return this.canvisBucalsRepositori.findAllByUsuariOrderByDataDesc(usuari);
    }

    @PostMapping()
    public void saveCanvisBucals(@RequestBody CanvisBucals canvisBucals){
        this.canvisBucalsRepositori.save(canvisBucals);
    }
}
