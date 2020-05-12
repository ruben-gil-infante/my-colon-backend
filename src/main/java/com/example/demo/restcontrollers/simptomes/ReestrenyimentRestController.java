package com.example.demo.restcontrollers.simptomes;

import com.example.demo.domain.registre_simptomes.Reestrenyiment;
import com.example.demo.repositories.ReestrenyimentRepositori;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/reestrenyiment")
public class ReestrenyimentRestController {

    private ReestrenyimentRepositori reestrenyimentRepositori;

    public ReestrenyimentRestController(ReestrenyimentRepositori reestrenyimentRepositori){
        this.reestrenyimentRepositori = reestrenyimentRepositori;
    }

    @GetMapping("/{usuari}")
    public List<Reestrenyiment> getReestrenyimentByUsuari(@PathVariable Integer usuari){
        return this.reestrenyimentRepositori.findAllByUsuari(usuari);
    }

    @PostMapping()
    public void saveReestrenyiment(@RequestBody Reestrenyiment reestrenyiment){
        this.reestrenyimentRepositori.save(reestrenyiment);
    }

}
