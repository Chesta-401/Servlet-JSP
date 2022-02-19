package com.ymsli.productapp.model.service;

import java.util.List;
import java.util.Optional;

import com.ymsli.productapp.model.persistence.product.Product;
import com.ymsli.productapp.model.persistence.product.ProductDao;
import com.ymsli.productapp.model.persistence.product.ProductDaoImpl;
import com.ymsli.productapp.model.exceptions.DataAccessException;

public class ProductServiecImpl implements ProductService{
	private ProductDao productDao;
	public ProductServiecImpl(){
		productDao=new ProductDaoImpl();
	}

	@Override
	public Product addProduct(Product product) {
		return productDao.addProduct(product);
	}

	@Override
	public void deleteProduct(int id) {
		productDao.deleteProduct(id);
		
	}

	@Override
	public void updateProduct(int id, Product product) {
		productDao.updateProduct(id, product);
		
	}

	@Override
	public List<Product> getAllProduct() throws DataAccessException {
		return productDao.getAllProduct();
	}

	@Override
	public Optional<Product> getById(int id) {
		return productDao.getById(id);
	}

}
