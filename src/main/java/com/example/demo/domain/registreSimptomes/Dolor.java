package com.example.demo.domain.registreSimptomes;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "dolor")
public class Dolor {
    private int id;
    private boolean afirmatiu;
    private String localitzacio;
    private int valor;
    private String descripcioDolor;
    private String quanApareixDolor;
    private Date data;
    private Integer usuari;

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

    @Column(name = "valor")
    public int getValor() {
        return valor;
    }

    public void setValor(int fatiga) {
        this.valor = fatiga;
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

    @Temporal(TemporalType.DATE)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
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
