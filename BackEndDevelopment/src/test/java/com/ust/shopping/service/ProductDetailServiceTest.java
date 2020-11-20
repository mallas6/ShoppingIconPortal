package com.ust.shopping.service;

import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.ust.shopping.Util.ProductUtil;
import com.ust.shopping.model.Details;
import com.ust.shopping.model.ProductMsg;
import com.ust.shopping.repository.ProductDetailsRepository;

@RunWith(MockitoJUnitRunner.class)
public class ProductDetailServiceTest {

	@MockBean
	private Details details;
	
	@Mock
	private ProductDetailsRepository repository;
	@InjectMocks
	private ProductDetailsServiceImpl serviceImpl;
	

	@Before
	public void setUp() throws Exception {

		MockitoAnnotations.initMocks(this);

	}

	@Test
	public void addProductDetailsSuccess() {
		when(repository.saveAll(Mockito.any())).thenReturn(ProductUtil.productDetails());
		ProductMsg msg = serviceImpl.add(ProductUtil.productDetails());
		Assert.assertEquals("SUCCESS", msg.getMessageHeader().getMessageStatus());
	}
	
	@Test
	public void findproduct() {
		Optional<Details> detail=Optional.ofNullable(ProductUtil.productDetails().get(0));
		when(repository.findById(Mockito.any())).thenReturn(detail);
		Details details = serviceImpl.find(1);
		Assert.assertNotNull(details);
	}

	
}
