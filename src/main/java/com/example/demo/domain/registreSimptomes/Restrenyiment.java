package com.example.demo.domain.registreSimptomes;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "restrenyiment")
public class Restrenyiment {

    private int id;
    private boolean afirmatiu;
    private int ultimCop;
    private int escalaBristol;
    private int color;
    private Date data;
    private Integer usuari;

    public Restrenyiment(){}

    public Restrenyiment(int id, boolean afirmatiu, int ultimCop, int escalaBristol, int color, Date data, Integer usuari) {
        this.id = id;
        this.afirmatiu = afirmatiu;
        this.ultimCop = ultimCop;
        this.escalaBristol = escalaBristol;
        this.color = color;
        this.data = data;
        this.usuari = usuari;
    }

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

    @Column(name = "escala_bristol")
    public int getEscalaBristol(){ return this.escalaBristol; }
    public void setEscalaBristol(int escalaBristol){
        this.escalaBristol = escalaBristol;
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
    public Integer getUsuari() {
        return usuari;
    }

    public void setUsuari(Integer userId) {
        this.usuari = userId;
    }
}
