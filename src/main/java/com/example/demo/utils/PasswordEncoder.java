package com.example.demo.utils;

import net.bytebuddy.pool.TypePool;
import org.springframework.stereotype.Service;

@Service
public class PasswordEncoder {

    public PasswordEncoder(){

    }

    public String MD5Encriptation (String password){
        try{
            java.security.MessageDigest md = java.security.MessageDigest.getInstance("MD5");
            byte [] array = md.digest(password.getBytes());
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < array.length; i++){
                sb.append(Integer.toHexString(array[i] & 0xFF | 0x100).substring(1, 3));
            }

            return sb.toString();

        }catch(java.security.NoSuchAlgorithmException e){

        }

        return null;
    }


}
