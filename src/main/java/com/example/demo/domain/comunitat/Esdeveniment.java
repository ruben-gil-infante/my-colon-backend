package com.example.demo.domain.comunitat;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "esdeveniment")
public class Esdeveniment {

    private int id;
    private Date data;
    private String numeroTelefon;
    private String ubicacio;
    private String descripcio;

    public Esdeveniment() {}

    public Esdeveniment(int id, Date data, String numeroTelefon, String ubicacio, String descripcio) {
        this.id = id;
        this.data = data;
        this.numeroTelefon = numeroTelefon;
        this.ubicacio = ubicacio;
        this.descripcio = descripcio;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    public int getId(){return this.id;}

    public void setId(int eventComunitatId){
        this.id = eventComunitatId;
    }

    @Temporal(TemporalType.DATE)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
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

    @Column(name = "ubicacio")
    public String getUbicacio(){ return this.ubicacio; }

    public void setUbicacio(String ubicacio){
        this.ubicacio = ubicacio;
    }
}
