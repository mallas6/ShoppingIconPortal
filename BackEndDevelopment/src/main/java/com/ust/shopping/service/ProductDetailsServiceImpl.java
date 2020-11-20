package com.ust.shopping.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.shopping.model.Details;
import com.ust.shopping.model.MessageHeader;
import com.ust.shopping.model.ProductMsg;
import com.ust.shopping.repository.ProductDetailsRepository;

@Service
public class ProductDetailsServiceImpl implements ProductDetailsService {

	@Autowired
	private ProductDetailsRepository repository;

	
	@Override
	public ProductMsg add(List<Details> details) {
		ProductMsg msg=createMsg("Creating Details");
		repository.saveAll(details);
		return msg;
	}



	@Override
	public Details find(Integer id) {

		Optional<Details> emp = repository.findById(id);

		return emp.get();
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
