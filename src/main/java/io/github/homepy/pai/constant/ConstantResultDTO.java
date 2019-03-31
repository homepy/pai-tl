package io.github.homepy.pai.constant;

public enum ConstantResultDTO {
	SUCCESS("0000000", ""), BIZ_EXCEPTION("8000000", "业务异常"), SYS_EXCEPTION("9999998", "系统异常"),
	UNKNOW_ERROR("9999999", "未知错误");

	private String errorCode;
	private String errorMsg;

	ConstantResultDTO(String errorCode, String errorMsg) {
		this.errorCode = errorCode;
		this.errorMsg = errorMsg;
	}

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

}
