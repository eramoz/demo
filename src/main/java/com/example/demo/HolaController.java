package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaController {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@GetMapping("/api/hola")
	public String hola() {
		return "Hola mundo";
	}
	
	@GetMapping("/api/test")
	public String testConnection() {
		String result = jdbcTemplate.queryForObject("SELECT ID FROM USERAPP.TPRUEBA WHERE ROWNUM=1", String.class);
		return result;
	}


}
