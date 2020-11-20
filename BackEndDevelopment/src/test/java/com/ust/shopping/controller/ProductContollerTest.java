package com.ust.shopping.controller;

import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Optional;
import java.util.UUID;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.ust.shopping.Util.ProductUtil;
import com.ust.shopping.model.Details;
import com.ust.shopping.model.MessageHeader;
import com.ust.shopping.model.Product;
import com.ust.shopping.model.ProductMsg;
import com.ust.shopping.service.ProductServiceImpl;

public class ProductContollerTest {

	@MockBean
	private Details details;

	@InjectMocks
	private ProductController controller;
	@Mock
	private ProductServiceImpl serviceImpl;

	@Before
	public void setUp() throws Exception {

		MockitoAnnotations.initMocks(this);

	}

	@Test
	public void addProductSuccessTest() {
		ProductMsg msg=createMsg("Adding all Products");
		when(serviceImpl.add(Mockito.any())).thenReturn(msg);
		ProductMsg msgresponse = controller.addAllProduct();
		Assert.assertEquals("SUCCESS", msgresponse.getMessageHeader().getMessageStatus());
	}

	@Test
	public void findproductTest() {
		ProductMsg msg=createMsg("find Products by id");
		when(serviceImpl.find(Mockito.any())).thenReturn(msg);
		ProductMsg response = controller.findProduct(1);
		Assert.assertEquals("SUCCESS", response.getMessageHeader().getMessageStatus());
	}

	@Test
	public void findAllTest() {
		ProductMsg msg=createMsg("find all Products");
		when(serviceImpl.findAll()).thenReturn(msg);
		ProductMsg response = controller.findAllProduct();
		Assert.assertEquals("SUCCESS", response.getMessageHeader().getMessageStatus());
	}

	private ProductMsg createMsg(String messageType) {
		ProductMsg msg = new ProductMsg();
		msg.setMessageHeader(getHeader(messageType));
		msg.setMessagePayload(new ArrayList<>());

		return msg;
	}

	private MessageHeader getHeader(String messageType) {
		MessageHeader messageHeader = new MessageHeader();
		messageHeader.setMessageType(messageType);
		messageHeader.setMessageId(UUID.randomUUID().toString());
		messageHeader.setMessageStatus("SUCCESS");
		return messageHeader;
	}
}
