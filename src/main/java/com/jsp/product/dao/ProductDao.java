package com.jsp.product.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.product.dto.Product;

public class ProductDao {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Omkar");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	public Product saveProduct(Product product) {
		entityTransaction.begin();
		entityManager.persist(product);
		entityTransaction.commit();
		return product;
	}
	public Product updateProduct(Product product) {
		Product p=entityManager.find(Product.class, product.getId());
		p.setName(product.getName());
		p.setBrand(product.getBrand());
		p.setPrice(product.getPrice());
		
		entityTransaction.begin();
		entityManager.merge(p);
		entityTransaction.commit();
		return p;
	}
				
	public void getProductById(int id) {
		Product product=entityManager.find(Product.class, id);
		if (product!=null) {
			System.out.println("==============");
			System.out.println("Product id: "+product.getId());
			System.out.println("Product name: "+product.getName());
			System.out.println("Product brand: "+product.getBrand());
			System.out.println("Product Price: "+product.getPrice());
		}
	}
	public void getAllProduct() {
		String sql="Select p from Product p";
		Query query=entityManager.createQuery(sql);
		List<Product> products=query.getResultList();
		for (Product p : products) {
			System.out.println("===============");
			System.out.println("Product id: "+p.getId());
			System.out.println("Product name: "+p.getName());
			System.out.println("Product brand: "+p.getBrand());
			System.out.println("Product Price: "+p.getPrice());
		}
	}
	public void deleteProduct(int id) {
		Product product=entityManager.find(Product.class, id);
		if (product!=null) {
			entityTransaction.begin();
			entityManager.remove(product);
			entityTransaction.commit();
			System.out.println("object with above id removed");
		}else {
			System.out.println("no such id found");
		}
		}
	}
	



/*
saveProduct
updateProduct
getProductById
getAllProduct
deleteProductById
*/
