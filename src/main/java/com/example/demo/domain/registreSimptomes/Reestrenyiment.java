package com.example.demo.domain.registreSimptomes;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "reestrenyiment")
public class Reestrenyiment {

    private int id;
    private boolean afirmatiu;
    private int ultimCop;
    private int bristol;
    private int color;
    private Date data;
    private Integer usuari;

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

    @Column(name = "color")
    public int getColor(){return this.color;}

    public void setColor(int color){this.color = color;}

    @Column(name = "ultim_cop")
    public int getUltimCop(){return this.ultimCop;}

    public void setUltimCop(int ultimCop){this.ultimCop = ultimCop;}

    @Column(name = "bristol")
    public int getBristol(){return this.bristol;}

    public void setBristol(int bristol){this.bristol = bristol;}

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
    public Integer getUsuari() {
        return usuari;
    }

    public void setUsuari(Integer userId) {
        this.usuari = userId;
    }
}
