package com.example.demo.domain.registre_simptomes;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "reestrenyiment")
public class Reestrenyiment {

    private int id;
    private boolean afirmatiu;
    private String ultimCopVentre;
    private String colorUltimaFemta;
    private int escalaBristol;
    private Date data;
    private String usuari;

    public Reestrenyiment (){}

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    public int getId(){
        return this.id;
    }

    public void setId(int reestrenyimentId){
        this.id = reestrenyimentId;
    }

    @Column(name = "afirmatiu")
    public boolean isAfirmatiu() {
        return afirmatiu;
    }

    public void setAfirmatiu(boolean afirmatiu) {
        this.afirmatiu = afirmatiu;
    }

    @Column(name = "ultim_cop_ventre")
    public String getUltimCopVentre() {
        return ultimCopVentre;
    }

    public void setUltimCopVentre(String ultimCopVentre) {
        this.ultimCopVentre = ultimCopVentre;
    }

    @Column(name = "color_ultima_femta")
    public String getColorUltimaFemta() {
        return colorUltimaFemta;
    }

    public void setColorUltimaFemta(String colorUltimaFemta) {
        this.colorUltimaFemta = colorUltimaFemta;
    }

    @Column(name = "escala_bristol")
    public int getEscalaBristol() {
        return escalaBristol;
    }

    public void setEscalaBristol(int escalaBristol) {
        this.escalaBristol = escalaBristol;
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
