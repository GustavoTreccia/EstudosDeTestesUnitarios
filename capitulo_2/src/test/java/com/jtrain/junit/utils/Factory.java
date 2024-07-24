package com.jtrain.junit.utils;

import java.time.Instant;

import com.jtrain.junit.dto.ProductDTO;
import com.jtrain.junit.entities.Category;
import com.jtrain.junit.entities.Product;

public class Factory {
	public static Product createProduct() {
		Product product = new Product(1L, "Phone", "Good Phone", 800.0, "https://img.com/img.png", Instant.parse("2020-10-20T03:00:00Z"));
		product.getCategories().add(createCategory());
		return product;		
	}
	
	public static ProductDTO createProductDTO() {
		Product product = createProduct();
		return new ProductDTO(product, product.getCategories());
	}
	
	public static Category createCategory() {
		return new Category(2L, "Electronics");
	}
}
