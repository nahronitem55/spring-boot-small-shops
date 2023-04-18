package com.business.springbootsmallshops.security.jwt;
/*
 * @created 03/04/2023 - 16:01
 * @project spring-boot-small-shops
 * @author orhan.metin
 */

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class JwtProvider implements IJwtProvider {

    @Value("${app.jwt.secret}")
    private String JWT_SECRET;

    @Value("${app.jwt.expiration-in-ms}")
    private String JWT_EXPIRATION_IN_MS;

}
