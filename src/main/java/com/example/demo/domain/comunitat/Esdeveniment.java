package com.example.demo.domain.comunitat;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "esdeveniment")
public class Esdeveniment {

    private int id;
    private Date data;
    private String numeroTelefon;
    private String descripcio;

    public Esdeveniment() {}

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    public int getId(){return this.id;}

    public void setId(int eventComunitatId){
        this.id = eventComunitatId;
    }

    @Column(name = "data")
    public Date getData(){return this.data;}

    public void setData(Date data){this.data = data;}

    @Column(name = "numero_telefon")
    public String getNumeroTelefon() {
        return this.numeroTelefon;
    }

    public void setNumeroTelefon(String numeroTelefon) {
        this.numeroTelefon = numeroTelefon;
    }

    @Column(name = "descripcio")
    public String getDescripcio() {
        return descripcio;
    }

    public void setDescripcio(String descripcio) {
        this.descripcio = descripcio;
    }
}
