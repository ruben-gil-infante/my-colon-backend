package com.example.demo.domain.nota;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "nota")
public class Nota {

    private int id;
    private int usuari;
    private Date data;
    private String descripcio;


    public Nota(){}

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int getId(){return this.id;}

    public void setId(int eventId){this.id = eventId;}

    @Column(name="usuari")
    public int getUsuari(){return this.usuari;}

    public void setUsuari(int userId){this.usuari = userId;}

    @Temporal(TemporalType.DATE)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")    @Column(name = "data")
    public Date getData(){return this.data;}

    public void setData(Date data){this.data = data;}

    @Column(name = "descripcio")
    public String getDescripcio(){return this.descripcio;}

    public void setDescripcio(String descripcio){this.descripcio = descripcio;}

}
