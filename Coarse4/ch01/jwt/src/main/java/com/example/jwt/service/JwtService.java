package com.example.jwt.service;

import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import io.jsonwebtoken.security.SignatureException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.Map;
import java.util.Objects;

@Slf4j
@Service
public class JwtService {
    private static String secretKey = "java11SpringBootJWTTokenIssueMethod";// 256비트를 넘는 임의의 secretKey

    // jwt 토큰 생성
    public String create(
            Map<String, Object> claims,
            LocalDateTime expireAt
    ){
        var key = Keys.hmacShaKeyFor(secretKey.getBytes());
        var _expireAt = Date.from(expireAt.atZone(ZoneId.systemDefault()).toInstant());

        return Jwts.builder()
                .signWith(key, SignatureAlgorithm.HS256)
                .setClaims(claims)
                .setExpiration(_expireAt)
                .compact();
    }

    // jwt 토큰 검증
    public void validation(String token){
        var key = Keys.hmacShaKeyFor(secretKey.getBytes());

        var parser = Jwts.parserBuilder()
                .setSigningKey(key)
                .build();

        try {
            var result = parser.parseClaimsJws(token); // 토큰 에러 발생 위치

            result.getBody().entrySet().forEach(value -> {
                log.info("key : {}, value : {}",value.getKey(), value.getValue());
            });
        }catch (Exception e){
            if (e instanceof SignatureException){
                // 토큰이 유효하지 않음(토큰이 변경된 경우)
                throw new RuntimeException("JWT Token Not Valid Exception");
            }else if (e instanceof ExpiredJwtException){
                // 토큰 만료
                throw new RuntimeException("JWT Token Expired Exception");
            }else {
                throw new RuntimeException("JWT Token Validation Exception");
            }
        }
    }
}
