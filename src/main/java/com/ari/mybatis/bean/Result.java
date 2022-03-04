package com.ari.mybatis.bean;

public class Result {
	private int status;
	private String message;
	private Object     data;
	
	public Result() {
		this.status =200;
		this.message ="success";
	}
	public Result(String message) {
		this.status =200;
		this.message =message;
	}	
	public Result(Object data) {
		this.status =200;
		this.message ="success";
		this.data = data;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	
	
}
