package com.example.demo.domain.registreSimptomes;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "vomits")
public class Vomits {

    private int id;
    private Integer usuari;
    private boolean afirmatiu;
    private int cops;
    private String descripcio;
    private boolean avui;
    private Date data;

    public Vomits(){}

    public Vomits(int id, Integer usuari, boolean afirmatiu, int cops, String descripcio, boolean avui, Date data) {
        this.id = id;
        this.usuari = usuari;
        this.afirmatiu = afirmatiu;
        this.cops = cops;
        this.descripcio = descripcio;
        this.avui = avui;
        this.data = data;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "usuari")
    public int getUsuari() {
        return usuari;
    }

    public void setUsuari(int usuari) {
        this.usuari = usuari;
    }

    @Column(name = "afirmatiu")
    public boolean isAfirmatiu() {
        return afirmatiu;
    }

    public void setAfirmatiu(boolean afirmatiu) {
        this.afirmatiu = afirmatiu;
    }

    @Column(name = "cops")
    public int getCops() {
        return cops;
    }

    public void setCops(int cops) {
        this.cops = cops;
    }

    @Column(name = "descripcio")
    public String getDescripcio() {
        return descripcio;
    }

    public void setDescripcio(String descripcio) {
        this.descripcio = descripcio;
    }

    @Column(name = "avui")
    public boolean isAvui() {
        return avui;
    }

    public void setAvui(boolean avui) {
        this.avui = avui;
    }

    @Temporal(TemporalType.DATE)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    @Column(name = "data")
    public Date getData(){return this.data;}

    public void setData(Date data){this.data = data;}
}
