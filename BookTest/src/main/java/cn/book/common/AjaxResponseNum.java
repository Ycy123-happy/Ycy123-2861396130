package cn.book.common;

public enum AjaxResponseNum {

	SUCCESS("0","成功"),
	ERROR_PARAM("-2","参数错误"),
	ERROR_DATA_EMPTY("-3","无参数"),
	FAIL("-1","失败");
	private String code;
	private String name;
	private AjaxResponseNum(String code, String name) {
		this.code = code;
		this.name = name;
	}
	private AjaxResponseNum() {
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
