package com.example.JWT;


import java.util.Date;
import java.util.concurrent.TimeUnit;

import javax.crypto.SecretKey;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;

public class Demo {

    public static void main(String[] args) {
        SecretKey key = Keys.secretKeyFor(SignatureAlgorithm.HS256);

        String token = Jwts.builder().setId("VJ") // id
                .setSubject("Solo") // subject
                .setIssuer("Vijay") // provider
                .setIssuedAt(new Date(System.currentTimeMillis())) // token generation date
                .setExpiration(new Date(System.currentTimeMillis() + TimeUnit.MINUTES.toMillis(2))) // valid until
                .signWith(key) // sign with the secure key
                .compact(); // converts to string

        System.out.println(token);
    
    
    //reading token //parsing  also called as claming or claims   by proving two inputs
    }
}
