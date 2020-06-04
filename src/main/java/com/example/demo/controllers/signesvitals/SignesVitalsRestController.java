package com.example.demo.controllers.signesvitals;

import com.example.demo.domain.signesvitals.SignesVitals;
import com.example.demo.repositories.signesVitals.SignesVitalsRepositori;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/signesvitals")
public class SignesVitalsRestController {

    private SignesVitalsRepositori signesVitalsRepositori;

    public SignesVitalsRestController(SignesVitalsRepositori signesVitalsRepositori){
        this.signesVitalsRepositori = signesVitalsRepositori;
    }

    @GetMapping("/{usuari}")
    public List<SignesVitals> getAllSignesVitalsByUsuari(@PathVariable Integer usuari){
        return this.signesVitalsRepositori.findAllByUsuariOrderByDataAsc(usuari);
    }

    @PostMapping()
    public SignesVitals saveSignesVitals(@RequestBody SignesVitals signesVitals){
        return this.signesVitalsRepositori.save(signesVitals);
    }

}
