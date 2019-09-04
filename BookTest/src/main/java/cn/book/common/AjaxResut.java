package cn.book.common;

public class AjaxResut {
     private boolean success;
     private String message;
     private Object dataset;
	public AjaxResut() {
		super();
	}
	
	public AjaxResut(boolean success) {
		super();
		this.success = success;
	}

	public AjaxResut(String message, Object dataset) {
		super();
		this.message = message;
		this.dataset = dataset;
	}
    
	public AjaxResut(boolean success, String message) {
		super();
		this.success = success;
		this.message = message;
	}

	public AjaxResut(boolean success, String message, Object dataset) {
		super();
		this.success = success;
		this.message = message;
		this.dataset = dataset;
	}
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Object getDataset() {
		return dataset;
	}
	public void setDataset(Object dataset) {
		this.dataset = dataset;
	}
     
}
