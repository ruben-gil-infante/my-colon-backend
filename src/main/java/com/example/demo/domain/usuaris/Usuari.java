package com.example.demo.domain.usuaris;


import javax.persistence.*;

@Entity(name = "usuari")
public class Usuari {

    private int id;
    private String nom;
    private String primerCognom;
    private String segonCognom;
    private String correuElectronic;
    private String password;

    public Usuari (){}

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
}
