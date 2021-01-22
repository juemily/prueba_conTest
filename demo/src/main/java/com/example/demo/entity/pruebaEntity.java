package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Required;

import com.sun.istack.NotNull;

import lombok.Data;

@Entity
@Table(name="prueba")
@Data
public class pruebaEntity {
	@Id
	@Column(name="sku",nullable = false, length = 8)
	private int sku;
	
	
	@NotNull
	@Column(name = "name")
	private String name;
	
	@NotNull
	@Column(name= "brand")
	private String brand;
	
	@NotNull
	@Column(name= "size")
	private String size;
	
	@NotNull
	@Column(name= "price")
	private Long price;
	
	@NotNull
	@Column(name= "principal_image" )
	private String principalImage;

	@NotNull
	@Column(name= "other_images" )
	private String otherImages;
	

	public pruebaEntity() {
		
	}


	public pruebaEntity(int sku, String name, String brand, String size, Long price, String principalImage,
			String otherImages) {
		
		this.sku = sku;
		this.name = name;
		this.brand = brand;
		this.size = size;
		this.price = price;
		this.principalImage = principalImage;
		this.otherImages = otherImages;
	}
	
	
	
	
}
