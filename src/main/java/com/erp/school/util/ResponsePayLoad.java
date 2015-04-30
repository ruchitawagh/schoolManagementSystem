package com.erp.school.util;

public class ResponsePayLoad {
	ResponsePayLoadStatus status;
	private Object object;

	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}

	public ResponsePayLoadStatus getStatus() {
		return status;
	}

	public void setStatus(ResponsePayLoadStatus status) {
		this.status = status;
	}
}
