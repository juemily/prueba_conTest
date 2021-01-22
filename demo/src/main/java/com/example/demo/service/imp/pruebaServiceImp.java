package com.example.demo.service.imp;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.entity.pruebaEntity;
import com.example.demo.repository.pruebaRepository;
import com.example.demo.service.pruebaService;

import lombok.SneakyThrows;

@Service("PruebaServiceImp")
public class pruebaServiceImp implements pruebaService {
	private static final Log LOG = LogFactory.getLog(pruebaServiceImp.class);

	@Autowired
	@Qualifier("PruebaRepository")
	private pruebaRepository pruebaRepository;

	@SneakyThrows
	@Override
	public String addProd(pruebaEntity prod) {
		
		String response ="FAIL";
		if (prod.getSku()>1000000 && prod.getSku()<99999999 && prod.getName()!="" && prod.getBrand()!="" &&prod.getSize()!="" && prod.getPrice()>0 &&prod.getPrincipalImage()!="") {
			
			
			if (prod.getPrincipalImage().startsWith("https://") &&(prod.getOtherImages().isEmpty())) {
				try {
					pruebaRepository.save(prod);
					response="OK";
				} catch (Exception e) {
					LOG.error(e);
				}
				
			} if (prod.getPrincipalImage().startsWith("https://") && prod.getOtherImages().startsWith("https://")) {
				try {
					pruebaRepository.save(prod);
					response="OK";
				} catch (Exception e) {
					LOG.error(e);
				}
				
			}
		}
		
		return response;
	}

	@SneakyThrows
	@Override
	public List<pruebaEntity> getAll() {
		return pruebaRepository.findAll();
	}

}
