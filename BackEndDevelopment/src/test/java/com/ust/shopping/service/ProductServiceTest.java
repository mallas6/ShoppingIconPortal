package com.ust.shopping.service;

import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.ust.shopping.Util.ProductUtil;
import com.ust.shopping.model.Details;
import com.ust.shopping.model.Product;
import com.ust.shopping.model.ProductMsg;
import com.ust.shopping.repository.ProductRepository;

public class ProductServiceTest {

	@MockBean
	private Details details;

	@Mock
	private ProductRepository repository;
	@InjectMocks
	private ProductServiceImpl serviceImpl;

	@Before
	public void setUp() throws Exception {

		MockitoAnnotations.initMocks(this);

	}

	@Test
	public void addProductSuccessTest() {
		when(repository.saveAll(Mockito.any())).thenReturn(ProductUtil.products());
		ProductMsg msg = serviceImpl.add(ProductUtil.products());
		Assert.assertEquals("SUCCESS", msg.getMessageHeader().getMessageStatus());
	}

	@Test
	public void findproductTest() {
		Optional<Product> product = Optional.ofNullable(ProductUtil.products().get(0));
		when(repository.findById(Mockito.any())).thenReturn(product);
		ProductMsg msg = serviceImpl.find(1);
		Assert.assertEquals("SUCCESS", msg.getMessageHeader().getMessageStatus());
	}
	
	@Test
	public void findAllTest() {
		when(repository.findAll()).thenReturn(ProductUtil.products());
		ProductMsg msg = serviceImpl.findAll();
		Assert.assertEquals("SUCCESS", msg.getMessageHeader().getMessageStatus());
	}

}
