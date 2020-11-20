package com.ust.shopping.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.shopping.model.MessageHeader;
import com.ust.shopping.model.Product;
import com.ust.shopping.model.ProductMsg;
import com.ust.shopping.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository empRepository;

	@Override
	public ProductMsg add(List<Product> product) {
		ProductMsg msg = createMsg("Adding product");

		List<Product> emp = empRepository.saveAll(product);

		return msg;
	}

	@Override
	public ProductMsg find(Integer id) {
		ProductMsg msg = createMsg("Find product");

		Optional<Product> emp = empRepository.findById(id);
		msg.getMessagePayload().add(emp.get());

		return msg;
	}

	@Override
	public ProductMsg findAll() {
		ProductMsg msg = createMsg("All product's");
		List<Product> products = empRepository.findAll();
		msg.getMessagePayload().addAll(products);
		return msg;
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
