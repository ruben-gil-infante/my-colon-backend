package com.example.demo.domain.registre_simptomes;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "apetit")
public class Apetit {
    private int id;
    private boolean afirmatiu;
    private int esmorzarAcabat;
    private int dinarAcabat;
    private int soparAcabat;
    private Date data;
    private int usuari;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int apetitId) {
        this.id = apetitId;
    }

    @Column(name = "afirmatiu", nullable = false)
    public boolean isAfirmatiu() {
        return afirmatiu;
    }

    public void setAfirmatiu(boolean afirmatiu) {
        this.afirmatiu = afirmatiu;
    }

    @Column(name = "esmorzar_acabat")
    public int getEsmorzarAcabat() {
        return esmorzarAcabat;
    }

    public void setEsmorzarAcabat(int esmorzarAcabat) {
        this.esmorzarAcabat = esmorzarAcabat;
    }

    @Column(name = "dinar_acabat")
    public int getDinarAcabat() {
        return dinarAcabat;
    }

    public void setDinarAcabat(int dinarAcabat) {
        this.dinarAcabat = dinarAcabat;
    }

    @Column(name = "sopar_acabat")
    public int getSoparAcabat() {
        return soparAcabat;
    }

    public void setSoparAcabat(int soparAcabat) {
        this.soparAcabat = soparAcabat;
    }

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

    public void setUsuari(int usuari) {
        this.usuari = usuari;
    }
}
