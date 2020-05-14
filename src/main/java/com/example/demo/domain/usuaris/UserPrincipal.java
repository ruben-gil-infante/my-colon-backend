package com.example.demo.domain.usuaris;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

// spring security
public class UserPrincipal implements UserDetails {

    private Usuari usuari;

    public UserPrincipal(Usuari usuari){
        this.usuari = usuari;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<GrantedAuthority> authorities = new ArrayList<>();
        GrantedAuthority authority = new SimpleGrantedAuthority("USUARI");
        authorities.add(authority);
        return authorities;
    }

    @Override
    public String getPassword() {
        try{
            return usuari.getPassword();
        }catch(NullPointerException e){
            return "";
        }
    }

    @Override
    public String getUsername() {
        return usuari.getCorreuElectronic();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
