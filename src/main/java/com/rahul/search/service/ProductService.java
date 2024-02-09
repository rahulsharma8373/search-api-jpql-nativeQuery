package com.rahul.search.service;

import java.util.List;

import com.rahul.search.entity.Product;

public interface ProductService {
	List<Product> searchProducts(String query);

    Product createProduct(Product product);
}
