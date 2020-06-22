package com.example.demo.controllers.simptomes;

import com.example.demo.domain.registreSimptomes.Restrenyiment;
import com.example.demo.repositories.registreSimptomes.RestrenyimentRepositori;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/restrenyiment")
public class RestrenyimentRestController {

    private RestrenyimentRepositori restrenyimentRepositori;

    public RestrenyimentRestController(RestrenyimentRepositori restrenyimentRepositori){
        this.restrenyimentRepositori = restrenyimentRepositori;
    }

    @GetMapping("/{usuari}")
    public List<Restrenyiment> getReestrenyimentByUsuari(@PathVariable Integer usuari){
        return this.restrenyimentRepositori.findAllByUsuariOrderByDataDesc(usuari);
    }

    @PostMapping()
    public void saveReestrenyiment(@RequestBody Restrenyiment restrenyiment){
        this.restrenyimentRepositori.save(restrenyiment);
    }

}
