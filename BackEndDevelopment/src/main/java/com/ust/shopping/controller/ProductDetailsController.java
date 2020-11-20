package com.ust.shopping.controller;

import java.util.ArrayList;
import java.util.List;

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
import com.ust.shopping.model.Details;
import com.ust.shopping.model.ProductMsg;
import com.ust.shopping.service.ProductDetailsService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1/details")
@Api(value = "ProductDetailsController")
public class ProductDetailsController {
	private Log log = LogFactory.getLog(getClass());
	@Autowired
	private ProductDetailsService service;

	
	@ApiOperation(value = "Add product", response = ProductMsg.class)
	@PostMapping("/product")
	public void addDetails() {
		log.info("Entry............");
		service.add(ProductUtil.productDetails());
	}


	@ApiOperation(value = "Get product")
	@GetMapping("/product/{id}")
	public Details findproduct(@PathVariable() int id) {
		log.info("findProduct details............");
		Details response = null;
		response = service.find(id);
		return response;
	}

	

}
