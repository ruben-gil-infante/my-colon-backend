package com.example.demo.domain.registre_simptomes;


import org.springframework.scripting.groovy.GroovyObjectCustomizer;

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
    private String usuari;

    // COLORS
    private static final int MARRO = 1;
    private static final int GROC = 2;
    private static final int VERD = 3;
    private static final int GRIS = 4;
    private static final int VERMELL = 5;
    private static final int NEGRE = 6;

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

    @Column(name = "data")
    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    @Column(name = "usuari")
    public String getUsuari() {
        return usuari;
    }

    public void setUsuari(String userId) {
        this.usuari = userId;
    }
}
