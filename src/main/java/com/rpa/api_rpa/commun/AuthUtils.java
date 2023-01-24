package com.rpa.api_rpa.commun;

import org.springframework.core.env.Environment;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureException;

public class AuthUtils {


    
    // private static String INTERNE_KEY = "secret.tokenKey";
    
    // public static Boolean isTokenVerified(String token, String source, Environment env) {
    //     return checkInterne(token, env.getProperty(INTERNE_KEY));
    // }


    // private static Boolean checkInterne (String token, String key) {
    //     try {
    //         final Claims claims = Jwts.parser().setSigningKey(key).parseClaimsJws(token).getBody();
    //         return true;
    //     } catch (final SignatureException e) {
    //        return false;
    //     }
        
    // }

}