package com.example.demo.controllers.simptomes;

import com.example.demo.domain.registreSimptomes.Reestrenyiment;
import com.example.demo.repositories.registreSimptomes.ReestrenyimentRepositori;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/reestrenyiment")
public class    ReestrenyimentRestController {

    private ReestrenyimentRepositori reestrenyimentRepositori;

    public ReestrenyimentRestController(ReestrenyimentRepositori reestrenyimentRepositori){
        this.reestrenyimentRepositori = reestrenyimentRepositori;
    }

    @GetMapping("/{usuari}")
    public List<Reestrenyiment> getReestrenyimentByUsuari(@PathVariable Integer usuari){
        return this.reestrenyimentRepositori.findAllByUsuariOrderByDataDesc(usuari);
    }

    @PostMapping()
    public void saveReestrenyiment(@RequestBody Reestrenyiment reestrenyiment){
        this.reestrenyimentRepositori.save(reestrenyiment);
    }

}
