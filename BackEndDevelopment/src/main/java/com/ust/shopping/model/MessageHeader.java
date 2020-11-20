package com.ust.shopping.model;

public class MessageHeader {

	private String messageId;
	private String messageType;
	private String messageStatus;

	public String getMessageId() {
		return messageId;
	}

	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}

	public String getMessageType() {
		return messageType;
	}

	public void setMessageType(String messageType) {
		this.messageType = messageType;
	}

	public String getMessageStatus() {
		return messageStatus;
	}

	public void setMessageStatus(String messageStatus) {
		this.messageStatus = messageStatus;
	}

	@Override
	public String toString() {
		return "MessageHeader [messageId=" + messageId + ", messageType=" + messageType + ", messageStatus="
				+ messageStatus + "]";
	}

}
