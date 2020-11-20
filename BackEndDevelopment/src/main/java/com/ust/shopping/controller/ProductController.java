package com.ust.shopping.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.shopping.Util.ProductUtil;
import com.ust.shopping.model.Product;
import com.ust.shopping.model.ProductMsg;
import com.ust.shopping.service.ProductService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1")
@Api(value = "productController")
public class ProductController {
	private Log log = LogFactory.getLog(getClass());
	@Autowired
	private ProductService prodService;

	@ApiOperation(value = "Add product", response = ProductMsg.class)
	@PostMapping("/product")
	public ProductMsg addAllProduct() {
		ProductMsg response = null;
		response = prodService.add(ProductUtil.products());
		return response;
	}


	@ApiOperation(value = "Get product")
	@GetMapping("/product/{id}")
	public ProductMsg findProduct(@PathVariable() Integer id) {

		ProductMsg response = null;
		response = prodService.find(id);
		return response;
	}

	@ApiOperation(value = "All products")
	@GetMapping("/product")
	public ProductMsg findAllProduct() {
		ProductMsg response = null;
		response = prodService.findAll();
		return response;
	}

}
