package com.ust.shopping.controller;

import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Optional;
import java.util.UUID;

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
import com.ust.shopping.model.MessageHeader;
import com.ust.shopping.model.ProductMsg;
import com.ust.shopping.repository.ProductDetailsRepository;
import com.ust.shopping.service.ProductDetailsServiceImpl;

public class ProductDetailsControllerTest {

	@MockBean
	private Details details;
	
	@InjectMocks
	private ProductDetailsController controller;
	@Mock
	private ProductDetailsServiceImpl prodService;
	

	@Before
	public void setUp() throws Exception {

		MockitoAnnotations.initMocks(this);

	}

	@Test
	public void addProductDetailsSuccess() {
		ProductMsg msg = createMsg("Adding Products");
		when(prodService.add(Mockito.any())).thenReturn(msg);
		controller.addDetails();
	}
	
	@Test
	public void findproduct() {
		Details msg = new Details();
		when(prodService.find(Mockito.any())).thenReturn(msg);
		Details details = prodService.find(1);
		Assert.assertNotNull(details);
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
