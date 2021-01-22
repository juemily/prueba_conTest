package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.pruebaEntity;
import com.example.demo.service.imp.pruebaServiceImp;

@RestController
@RequestMapping("/prueba")
public class pruebaController {

	@Autowired
	@Qualifier("PruebaServiceImp")
	private pruebaServiceImp pruebaServiceImp;

	@PostMapping("/addProduct")
	public ResponseEntity<pruebaEntity> addCourse(@RequestBody final pruebaEntity prod) {

		pruebaEntity returnProd = new pruebaEntity();
		
		
		
		String response = pruebaServiceImp.addProd(prod);
		
		if (response.contains("OK")) {
		return new ResponseEntity<pruebaEntity>(returnProd, HttpStatus.CREATED);
		}else {
			return new ResponseEntity<pruebaEntity>(returnProd, HttpStatus.BAD_REQUEST);
		}
	}
	
	@GetMapping("/getAll")
	public  List<pruebaEntity> getAll() {
		return pruebaServiceImp.getAll();
	}
	
	

}
