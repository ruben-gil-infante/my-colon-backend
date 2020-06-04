package com.example.demo.domain.nutricio;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "nutricio")
public class Nutricio {

    private int id;
    private int usuari;
    private int esmorzar;
    private int dinar;
    private int berenar;
    private int sopar;
    private int gotsAigua;
    private Date data;


    public Nutricio(){}

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int nutricioId) {
        this.id = nutricioId;
    }

    @Column(name = "usuari")
    public int getUsuari() {
        return usuari;
    }

    public void setUsuari(int usuariId) {
        this.usuari = usuariId;
    }

    @Column(name = "esmorzar")
    public int getEsmorzar() {
        return esmorzar;
    }

    public void setEsmorzar(int esmorzar) {
        this.esmorzar = esmorzar;
    }

    @Column(name = "dinar")
    public int getDinar() {
        return dinar;
    }

    public void setDinar(int dinar) {
        this.dinar = dinar;
    }

    @Column(name = "berenar")
    public int getBerenar() {
        return berenar;
    }

    public void setBerenar(int berenar) {
        this.berenar = berenar;
    }

    @Column(name = "sopar")
    public int getSopar() {
        return sopar;
    }

    public void setSopar(int sopar) {
        this.sopar = sopar;
    }

    @Column(name = "gots_aigua")
    public int getGotsAigua() {
        return gotsAigua;
    }

    public void setGotsAigua(int gotsAigua) {
        this.gotsAigua = gotsAigua;
    }

    @Temporal(TemporalType.DATE)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    @Column(name = "data")
    public Date getData(){return this.data;}

    public void setData(Date data){
        this.data = data;
    }
}
