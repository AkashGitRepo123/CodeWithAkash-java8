package com.methodreference;

public class ConstructorReference {
	public static void main(String[] args) {

		Messageable hello = new Message()::getMsg;
		hello.getMessage();
	}
}

@FunctionalInterface
interface Messageable {
	String getMessage(/* String msg */);
}

class Message {

	// Akash 1

	String msg = "hi there!";

	private String messageFrom;

	private int messageId;
	
	private int errorCode;
	
	public String getMessageTo() {
		return messageTo;
	}

	public void setMessageTo(String messageTo) {
		this.messageTo = messageTo;
	}

	private String messageTo;


	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public int getMessageId() {
		return messageId;
	}

	public void setMessageId(int messageId) {
		this.messageId = messageId;
	}

	public int getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}
	public String getMessageFrom() {
		return messageFrom;
	}
	public void setMessageFrom(String messageFrom) {
		this.messageFrom = messageFrom;
	}

	/*
	 * String getMsg( String msg ){ System.out.print(""); return ""; }
	 */
}