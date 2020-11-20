package com.ust.shopping.model;

import java.util.List;

public class ProductMsg {

	private MessageHeader messageHeader;
	private List<Product> messagePayload;

	public MessageHeader getMessageHeader() {
		return messageHeader;
	}

	public void setMessageHeader(MessageHeader messageHeader) {
		this.messageHeader = messageHeader;
	}

	public List<Product> getMessagePayload() {
		return messagePayload;
	}

	public void setMessagePayload(List<Product> messagePayload) {
		this.messagePayload = messagePayload;
	}

	@Override
	public String toString() {
		return "EmployeeMsg [messageHeader=" + messageHeader + ", messagePayload=" + messagePayload + "]";
	}

}
