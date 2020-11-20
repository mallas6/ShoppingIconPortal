package com.ust.shopping.service;

import java.util.List;

import com.ust.shopping.model.Details;
import com.ust.shopping.model.Product;
import com.ust.shopping.model.ProductMsg;

public interface ProductDetailsService {

	public ProductMsg add(List<Details> details);

	public Details find(Integer id);

	
}
