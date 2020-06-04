package com.example.demo.domain.registreSimptomes;


import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "diarrees")
public class Diarrees {

    private int id;
    private boolean afirmatiu;
    private int vegades;
    private int escalaBristol;
    private int color;
    private Date data;
    private Integer usuari;



    public Diarrees () {}

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int diarreesId) {
        this.id = diarreesId;
    }

    @Column(name = "afirmatiu")
    public boolean isAfirmatiu() {
        return afirmatiu;
    }

    public void setAfirmatiu(boolean afirmatiu) {
        this.afirmatiu = afirmatiu;
    }

    @Column(name = "vegades")
    public int getVegades() {
        return vegades;
    }

    public void setVegades(int vegades) {
        this.vegades = vegades;
    }

    @Column(name = "escala_bristol")
    public int getEscalaBristol() {
        return escalaBristol;
    }

    public void setEscalaBristol(int escalaBristol) {
        this.escalaBristol = escalaBristol;
    }

    @Column(name = "color")
    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    @Temporal(TemporalType.DATE)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-M-/yyyy")
    @Column(name = "data")
    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    @Column(name = "usuari")
    public int getUsuari() {
        return usuari;
    }

    public void setUsuari(int userId) {
        this.usuari = userId;
    }
}
