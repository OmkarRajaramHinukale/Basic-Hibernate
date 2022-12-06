package com.jsp.product.controller;

import com.jsp.product.dto.Product;
import com.jsp.product.productservice.ProductService;

public class UpdateProduct {

	public static void main(String[] args) {
		ProductService productService=new ProductService();
		Product product=new Product();
		if (product!=null) {
			product.setId(1);
			product.setName("jeans");
			product.setBrand("Zara");
			product.setPrice(3000);
			System.out.println("updated");
		}else {
			System.out.println("please try again");
		}
		productService.updateProduct(product);
	}

}
