package cn.book.model;

public class Book {
	private Integer bookId;
	private String bookNumber;
	private String bookName;
	private double bookPrice;
	public Book() {
		super();
	}
	
	public Book(Integer bookId, String bookNumber, String bookName, double bookPrice) {
		super();
		this.bookId = bookId;
		this.bookNumber = bookNumber;
		this.bookName = bookName;
		this.bookPrice = bookPrice;
	}

	public String getBookNumber() {
		return bookNumber;
	}

	public void setBookNumber(String bookNumber) {
		this.bookNumber = bookNumber;
	}

	public Integer getBookId() {
		return bookId;
	}
	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public double getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookNumber=" + bookNumber + ", bookName=" + bookName + ", bookPrice="
				+ bookPrice + "]";
	}
	
	

}
