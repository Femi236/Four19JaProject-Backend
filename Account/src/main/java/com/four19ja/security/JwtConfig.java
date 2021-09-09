package com.four19ja.security;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;

@Controller
public class JwtConfig {
    @Value("${security.jwt.uri:/auth/**}")
    private String uri;

    @Value("${security.jwt.header:Authorization}")
    private String header;

    @Value("${security.jwt.prefix:Bearer }")
    private String prefix;

    @Value("${security.jwt.expiration:#{60*60}}")
    private int expiration;

    @Value("${security.jwt.expiration:#{7*24*60*60}}")
    private int refreshExpiration;

    @Value("${security.jwt.secret:JwtSecretKey}")
    private String secret;

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public int getExpiration() {
        return expiration;
    }

    public void setExpiration(int expiration) {
        this.expiration = expiration;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public int getRefreshExpiration() {
        return refreshExpiration;
    }

    public void setRefreshExpiration(int refreshExpiration) {
        this.refreshExpiration = refreshExpiration;
    }
}