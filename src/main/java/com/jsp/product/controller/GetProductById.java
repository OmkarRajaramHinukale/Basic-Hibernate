package com.jsp.product.controller;

import com.jsp.product.productservice.ProductService;

public class GetProductById {

	public static void main(String[] args) {
		ProductService ps=new ProductService();
		ps.getProductById(1);

	}

}
