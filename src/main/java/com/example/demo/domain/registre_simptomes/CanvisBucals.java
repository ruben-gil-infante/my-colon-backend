package com.example.demo.domain.registre_simptomes;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "canvis_bucals")
public class CanvisBucals {

    private int id;
    private boolean afirmatiu;
    private String simptomes;
    private String usuari;
    private Date date;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int canvisBucalsId) {
        this.id = canvisBucalsId;
    }

    @Column(name = "afirmatiu")
    public boolean isAfirmatiu() {
        return afirmatiu;
    }

    public void setAfirmatiu(boolean afirmatiu) {
        this.afirmatiu = afirmatiu;
    }

    @Column(name = "simptomes")
    public String getSimptomes() {
        return simptomes;
    }

    public void setSimptomes(String simptomes) {
        this.simptomes = simptomes;
    }

    @Column(name = "usuari")
    public String getUsuari() {
        return usuari;
    }

    public void setUsuari(String userId) {
        this.usuari = userId;
    }

    @Column(name = "data")
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "CanvisBucals{" +
                "canvisBucalsId=" + id +
                ", afirmatiu=" + afirmatiu +
                ", simptomes='" + simptomes + '\'' +
                ", userId='" + usuari + '\'' +
                ", date=" + date +
                '}';
    }
}
