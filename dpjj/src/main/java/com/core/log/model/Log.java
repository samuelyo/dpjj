package main.java.com.core.log.model;

import java.util.Date;

import main.java.com.core.model.GeneralUser;

public class Log {
	
	private String controllerMethodDescription = null;
	private String method = null;
	private String type = null;
	private String requestIp = null;
	private String exceptionCode = null;
	private String exceptionDetail = null;
	private String params = null;
	private User createBy = null;
	private String createDate = null;

	public void setDescription(String controllerMethodDescription) {
		// TODO Auto-generated method stub
		this.controllerMethodDescription=controllerMethodDescription;
	}

	public void setMethod(String methodName) {
		// TODO Auto-generated method stub
		this.method=methodName;
	}

	public void setType(String typeName) {
		// TODO Auto-generated method stub
		this.type = typeName ;
	}

	public void setRequestIp(String ip) {
		// TODO Auto-generated method stub
		this.requestIp = ip;
	}

	public void setExceptionCode(String excode) {
		// TODO Auto-generated method stub
		this.exceptionCode = excode;
	}

	public void setExceptionDetail(String exDetail) {
		// TODO Auto-generated method stub
		this.exceptionDetail = exDetail;
	}

	public void setParams(String params) {
		// TODO Auto-generated method stub
		this.params =params;
	}

	public void setCreateBy(User user) {
		// TODO Auto-generated method stub
		this.createBy = (GeneralUser) user;
	}

	public void setCreateDate(String currentDate) {
		// TODO Auto-generated method stub
		this.createDate = currentDate;
	}

	public String getControllerMethodDescription() {
		return controllerMethodDescription;
	}

	public String getMethod() {
		return method;
	}

	public String getType() {
		return type;
	}

	public String getRequestIp() {
		return requestIp;
	}

	public String getExceptionCode() {
		return exceptionCode;
	}

	public String getExceptionDetail() {
		return exceptionDetail;
	}

	public String getParams() {
		return params;
	}

	public User getCreateBy() {
		return createBy;
	}

	public String getCreateDate() {
		return createDate;
	}

	@Override
	public String toString() {
		return "Log [controllerMethodDescription="
				+ controllerMethodDescription + "\r\n method=" + method
				+ "\r\n type=" + type + "\r\n requestIp=" + requestIp
				+ "\r\n exceptionCode=" + exceptionCode + "\r\n exceptionDetail="
				+ exceptionDetail + "\r\n params=" + params + "\r\n createBy="
				+ createBy.getUserName() + "\r\n createDate=" + createDate + "]\r\n";
	}
	
}
