package com.jsp.product.controller;

import com.jsp.product.dto.Product;
import com.jsp.product.productservice.ProductService;

public class SaveProduct {

	public static void main(String[] args) {
		
		Product product=new Product();
		product.setBrand("Denim");
		product.setName("Jeans");
		product.setPrice(1800);
		
		ProductService ps=new ProductService();
		product=ps.saveProduct(product);
		if (product!=null) {
			System.out.println("Data inserted");
		}else
			System.out.println("Not inserted");
	}

}
