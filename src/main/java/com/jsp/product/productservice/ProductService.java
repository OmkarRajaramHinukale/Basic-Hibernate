package com.jsp.product.productservice;

import com.jsp.product.dao.ProductDao;
import com.jsp.product.dto.Product;

public class ProductService {
	ProductDao productdao=new ProductDao();
	
	public Product saveProduct(Product product) {
	
		productdao.saveProduct(product);
		return product;
	}
	public Product updateProduct(Product product) {
		return productdao.updateProduct(product);
		
	}
	public void getProductById(int id) {
		productdao.getProductById(id);
	}
	public void getAllProduct() {
		productdao.getAllProduct();
	}
	public void deleteProduct(int id) {
		productdao.deleteProduct(id);
	}
}
