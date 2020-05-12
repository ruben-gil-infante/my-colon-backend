package com.example.demo.domain.registre_simptomes;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "fatiga")
public class Fatiga {
    private int id;
    private boolean afirmatiu;
    private int puntuacio;
    private Date data;
    private String usuari;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int fatigaId) {
        this.id = fatigaId;
    }

    @Column(name = "afirmatiu")
    public boolean isAfirmatiu() {
        return afirmatiu;
    }

    public void setAfirmatiu(boolean afirmatiu) {
        this.afirmatiu = afirmatiu;
    }

    @Column(name = "puntuaucio")
    public int getPuntuacio() {
        return puntuacio;
    }

    public void setPuntuacio(int puntacio) {
        this.puntuacio = puntacio;
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
