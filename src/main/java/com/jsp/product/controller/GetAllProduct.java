package com.jsp.product.controller;

import com.jsp.product.productservice.ProductService;

public class GetAllProduct {

	public static void main(String[] args) {
		ProductService ps=new ProductService();
		ps.getAllProduct();

	}

}
