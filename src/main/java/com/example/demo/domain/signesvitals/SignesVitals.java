package com.example.demo.domain.signesvitals;

import org.springframework.context.annotation.EnableLoadTimeWeaving;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "signe_vital")
public class SignesVitals {

    private int id;
    private Date data;
    private int usuari;
    private int valor;
    private int tipus;

    public SignesVitals(){

    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    @Column(name = "valor")
    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    @Column(name = "tipu")
    public int getTipus() {
        return tipus;
    }

    public void setTipus(int tipus) {
        this.tipus = tipus;
    }
}
