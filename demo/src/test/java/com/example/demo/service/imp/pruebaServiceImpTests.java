package com.example.demo.service.imp;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.entity.pruebaEntity;

@RunWith(SpringRunner.class)
@SpringBootTest
public class pruebaServiceImpTests {
	
	//@InjectMocks
	//private pruebaServiceImp pruebaServiceImp;
	
	@Mock
	private pruebaServiceImp pruebaServiceImp;
	

	
	
	
	@Test
	public void addProd() {
		
		String response ="FALSE";
		pruebaEntity prod = new pruebaEntity ();
		
		prod.setBrand("marca");
		prod.setName("nombre");
		prod.setOtherImages("https//fsdfsdfsdf");
		prod.setPrincipalImage("https//fsdfsdfsdf");
		prod.setSize("L");
		prod.setSku(1000001);
		
		
		when(pruebaServiceImp.addProd(prod)).thenReturn("OK");
	
		
		assertEquals("OK", pruebaServiceImp.addProd(prod));
		
	
		
	}
	
	@Test
	public void addProdFAIL() {
		
		String response ="FALSE";
		pruebaEntity prod = new pruebaEntity ();
		
		prod.setBrand("marca");
		prod.setName("nombre");
		prod.setOtherImages("//fsdfsdfsdf");
		prod.setPrincipalImage("fsdfsdfsdf");
		prod.setSize("L");
		prod.setSku(100001);
		
		
		when(pruebaServiceImp.addProd(prod)).thenReturn("FAIL");
	
		
		assertEquals("FAIL", pruebaServiceImp.addProd(prod));
		
	
		
	}
	
	

}
