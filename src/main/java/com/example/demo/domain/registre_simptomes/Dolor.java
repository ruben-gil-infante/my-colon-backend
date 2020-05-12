package com.example.demo.domain.registre_simptomes;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "dolor")
public class Dolor {
    private int id;
    private boolean afirmatiu;
    private String localitzacio;
    private int fatiga;
    private String descripcioDolor;
    private String quanApareixDolor;
    private Date data;
    private String usuari;

    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int dolorId) {
        this.id = dolorId;
    }

    @Column(name = "afirmatiu")
    public boolean isAfirmatiu() {
        return afirmatiu;
    }

    public void setAfirmatiu(boolean afirmatiu) {
        this.afirmatiu = afirmatiu;
    }

    @Column(name = "localitzacio")
    public String getLocalitzacio() {
        return localitzacio;
    }

    public void setLocalitzacio(String localitzacio) {
        this.localitzacio = localitzacio;
    }

    @Column(name = "fatiga")
    public int getFatiga() {
        return fatiga;
    }

    public void setFatiga(int fatiga) {
        this.fatiga = fatiga;
    }

    @Column(name = "descripcio")
    public String getDescripcioDolor() {
        return descripcioDolor;
    }

    public void setDescripcioDolor(String descripcioDolor) {
        this.descripcioDolor = descripcioDolor;
    }

    @Column(name = "aparicio")
    public String getQuanApareixDolor() {
        return quanApareixDolor;
    }

    public void setQuanApareixDolor(String quanApareixDolor) {
        this.quanApareixDolor = quanApareixDolor;
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
