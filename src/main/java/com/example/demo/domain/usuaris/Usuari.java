package com.example.demo.domain.usuaris;


import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "usuari")
public class Usuari {

    private int id;
    private String nom;
    private String primerCognom;
    private String segonCognom;
    private String correuElectronic;
    private int genere;
    private boolean sanitari;
    private Date dataNaixement;
    private String password;

    public Usuari (){}

    public Usuari(int id, String nom, String primerCognom, String segonCognom, String correuElectronic, int genere, Date dataNaixement, String password, boolean sanitari) {
        this.id = id;
        this.nom = nom;
        this.primerCognom = primerCognom;
        this.segonCognom = segonCognom;
        this.correuElectronic = correuElectronic;
        this.genere = genere;
        this.dataNaixement = dataNaixement;
        this.password = password;
        this.sanitari = sanitari;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    public int getId(){
        return this.id;
    }

    public void setId(int userId){
        this.id = userId;
    }

    @Column(name = "nom")
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Column(name = "primer_cognom")
    public String getPrimerCognom() {
        return primerCognom;
    }

    public void setPrimerCognom(String primerCognom) {
        this.primerCognom = primerCognom;
    }

    @Column(name = "segon_cognom")
    public String getSegonCognom() {
        return segonCognom;
    }

    public void setSegonCognom(String segonCognom) {
        this.segonCognom = segonCognom;
    }

    @Column(name = "correu_electronic")
    public String getCorreuElectronic() {
        return correuElectronic;
    }

    public void setCorreuElectronic(String correuElectronic) {
        this.correuElectronic = correuElectronic;
    }

    @Column(name = "password")
    public String getPassword(){return this.password; }

    public void setPassword(String password){
        this.password = password;
    }

    @Column(name = "genere")
    public int getGenere(){return this.genere;}

    public void setGenere(int genere){this.genere = genere;}

    @Column(name = "sanitari")
    public boolean getSanitari(){return this.sanitari;}

    public void setSanitari(boolean sanitari){
        this.sanitari = sanitari;
    }

    @Temporal(TemporalType.DATE)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    @Column(name = "data_naixement")
    public Date getDataNaixement(){return this.dataNaixement;}

    public void setDataNaixement(Date edat){ this.dataNaixement = edat; }
}
