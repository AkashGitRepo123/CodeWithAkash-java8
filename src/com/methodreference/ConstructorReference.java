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

	String msg = "hi";
	
	private int messageId;

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
	
	

	/*
	 * String getMsg( String msg ){ System.out.print(""); return ""; }
	 */
}