package com.rahul.search.service.impl;
import java.util.List;

import org.springframework.stereotype.Service;

import com.rahul.search.entity.Product;
import com.rahul.search.repository.ProductRepository;
import com.rahul.search.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

    private ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> searchProducts(String query) {
        List<Product> products = productRepository.searchProductsSQL(query);
        return products;
    }

    @Override
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }
}
