package com.methodreference;

public class ConstructorReference {
	public static void main(String[] args) {

		/*Messageable hello =*/ Message::getMsg;
		// hello.getMessage("Hello");
	}
}

@FunctionalInterface
interface Messageable {
	String getMessage(/* String msg */);
}

class Message {

	String msg;

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	

	/*
	 * String getMsg( String msg ){ System.out.print(""); return ""; }
	 */
}