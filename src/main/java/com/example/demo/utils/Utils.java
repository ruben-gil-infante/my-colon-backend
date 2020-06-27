package com.example.demo.utils;

import com.example.demo.domain.usuaris.Usuari;

import java.util.HashMap;
import java.util.Map;

public class Utils {

    public Utils(){}

    public Map<String, String> mapUsuari(Usuari usuari){
        Map<String, String> infoUsuari = new HashMap<>();

        infoUsuari.put("nom", usuari.getNom());
        infoUsuari.put("primerCognom", usuari.getPrimerCognom());
        infoUsuari.put("segonCognom", usuari.getSegonCognom());
        infoUsuari.put("correuElectronic", usuari.getCorreuElectronic());
        infoUsuari.put("id", String.valueOf(usuari.getId()));
        infoUsuari.put("sanitari", String.valueOf(usuari.getSanitari()));

        return infoUsuari;
    }

}
