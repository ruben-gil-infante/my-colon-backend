package com.example.demo.domain.signesvitals;

import com.example.demo.constants.SignesVitalsConstants;
import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "signe_vital")
public class SignesVitals {

    private int id;
    private Date data;
    private Integer usuari;
    private int valor;
    private int valorSecundari;
    private int tipus;

    public SignesVitals(){
    }

    public SignesVitals(int id, Date data, Integer usuari, int valor, int valorSecundari, int tipus) {
        this.id = id;
        this.data = data;
        this.usuari = usuari;
        this.valor = valor;
        this.valorSecundari = valorSecundari;
        this.tipus = tipus;
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

    @Column(name = "tipus")
    public int getTipus() {
        return tipus;
    }

    public void setTipus(int tipus) {
        this.tipus = tipus;
    }

    @Column(name = "valor_secundari")
    public int getValorSecundari (){
        return this.valorSecundari;
    }

    public void setValorSecundari(int valorSecundari){
        this.valorSecundari = valorSecundari;
    }

    @Transient
    public String getUnitat() {
        switch (tipus) {
            case SignesVitalsConstants.ACTIVITAT:
                return "Passos";
            case SignesVitalsConstants.FREQUENCIA_CARDIACA:
                return "bpm";
            case SignesVitalsConstants.TENSIO_ARTERIAL:
                return "mmHG";
            case SignesVitalsConstants.GLICEMIES:
                return "mg/dl";
            case SignesVitalsConstants.PES:
                return "Kg";
            case SignesVitalsConstants.TEMPERATURA:
                return "ºC";
        }

        return " ";
    }

}
