package io.github.homepy.pai.pojo.dto;

import java.io.Serializable;

public class ResultDTO<T extends Serializable> implements Serializable {

	private static final long serialVersionUID = 1388180829454960371L;

	private String errorCode;
	private String errorMsg;
	// success代表接口处理响应结果成功还是失败
	private boolean success;
	// 返回结果集
	private T module;

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public T getModule() {
		return module;
	}

	public void setModule(T module) {
		this.module = module;
	}

}
