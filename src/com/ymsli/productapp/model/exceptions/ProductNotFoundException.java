package com.ymsli.productapp.model.exceptions;

public class ProductNotFoundException extends RuntimeException {

	private static final long serialVersionUID = -8647661633909053045L;

	public ProductNotFoundException(String message) {
		super(message);
	}

}
