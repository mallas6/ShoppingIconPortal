package com.ust.shopping.service;

import java.util.List;

import com.ust.shopping.model.Product;
import com.ust.shopping.model.ProductMsg;

public interface ProductService {

	public ProductMsg add(List<Product> products);

	public ProductMsg findAll();

	ProductMsg find(Integer id);
}
