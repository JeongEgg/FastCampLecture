package com.example.jwt;

import com.example.jwt.service.JwtService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.HashMap;

@SpringBootTest
class JwtApplicationTests {

	@Autowired
	private JwtService jwtService;

	@Test
	void contextLoads() {
	}

	@Test
	void tokenCreate(){
		var claims = new HashMap<String, Object>();
		claims.put("user_id",923);

//		var expiredAt = LocalDateTime.now().plusMinutes(10);
		var expiredAt = LocalDateTime.now().plusSeconds(20);

		var jwtToken = jwtService.create(claims, expiredAt);

		System.out.println(jwtToken);
	}

	@Test
	void tokenValidation(){
		var token = "eyJhbGciOiJIUzI1NiJ9.eyJ1c2VyX2lkIjo5MjMsImV4cCI6MTcxMjA1MzYxN30.bhsHMVp8IZ93OWme0JJ1jJY3b4wOGQpz411zOAh5_0E";

		jwtService.validation(token);
	}

}
