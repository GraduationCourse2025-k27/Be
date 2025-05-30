package com.kltn.medicalwebsite.util;


import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import javax.crypto.SecretKey;
import java.util.Date;


@Component
public class JwtUtil {
    private  String SECRET_KEY = "qweiriytptrypkaaksdlaksdjklasjdliguqueiqwueioqwuajsdjasdhjkasdjhqweqoieuqioweuiajsd";


    private  final SecretKey key = Keys.hmacShaKeyFor(SECRET_KEY.getBytes());

    public  String generateToken(UserDetails userDetails){
        return Jwts.builder()
                .setSubject(userDetails.getUsername())
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + 1000 * 60 * 60 *10 ))
                .signWith(key)
                .compact();
    }
    public Claims extractClaims(String token){
        return  Jwts.parserBuilder()
                .setSigningKey(key)
                .build()
                .parseClaimsJws(token)
                .getBody();
    }
    public  String extractUsername(String token){
        return  extractClaims(token).getSubject();
    }

    public  boolean isTokenExpired(String token){
        return  extractClaims(token).getExpiration().before(new Date());
    }
    public  boolean validateToken(String token,UserDetails userDetails){
        return  (userDetails.getUsername().equals(extractUsername(token)) && !isTokenExpired((token)));
    }



}
