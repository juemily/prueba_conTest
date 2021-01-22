package com.example.demo.model;

import lombok.Data;

@Data
public class pruebaModel {

	private int sku;

	private String name;

	private String brand;

	private String size;

	private String price;

	private String principalImage;

	private String otherImages;


	public pruebaModel() {
		super();
		// TODO Auto-generated constructor stub
	}


	public pruebaModel(int sku, String name, String brand, String size, String price, String principalImage,
			String otherImages) {
		super();
		this.sku = sku;
		this.name = name;
		this.brand = brand;
		this.size = size;
		this.price = price;
		this.principalImage = principalImage;
		this.otherImages = otherImages;
	}

}
