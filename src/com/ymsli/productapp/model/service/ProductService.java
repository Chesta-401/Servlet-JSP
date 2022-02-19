package com.ymsli.productapp.model.service;

import java.util.List;
import java.util.Optional;

import com.ymsli.productapp.model.persistence.product.Product;
import com.ymsli.productapp.model.exceptions.DataAccessException;

public interface ProductService {
	public Product addProduct(Product product);
	public void deleteProduct(int id);
	public void updateProduct(int id,Product product);
	public List<Product> getAllProduct() throws DataAccessException;
	public Optional<Product> getById(int id);
	
}
