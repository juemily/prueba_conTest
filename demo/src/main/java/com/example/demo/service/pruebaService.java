package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.pruebaEntity;

public interface pruebaService {
	
	public abstract String  addProd(pruebaEntity prod);
	
	public abstract List<pruebaEntity> getAll();


}
