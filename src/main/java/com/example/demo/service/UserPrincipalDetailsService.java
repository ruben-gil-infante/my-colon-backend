package com.example.demo.service;

import com.example.demo.domain.usuaris.UserPrincipal;
import com.example.demo.domain.usuaris.Usuari;
import com.example.demo.repositories.UsuariRepositori;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserPrincipalDetailsService implements UserDetailsService {

    private UsuariRepositori usuariRepositori;

    public UserPrincipalDetailsService(UsuariRepositori usuariRepositori){
        this.usuariRepositori = usuariRepositori;
    }

    @Override
    public UserDetails loadUserByUsername(String correuElectronic) throws UsernameNotFoundException {
        Usuari usuari = this.usuariRepositori.findByCorreuElectronic(correuElectronic);
        UserPrincipal userPrincipal = new UserPrincipal(usuari);
        return userPrincipal;

    }
}