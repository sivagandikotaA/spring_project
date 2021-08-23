package com.example.library.book.controller;

public class Book {

	private String bookId;
	private String bookName;
	private String auother;

	public String getBookId() {
		return bookId;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuother() {
		return auother;
	}

	public void setAuother(String auother) {
		this.auother = auother;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", auother=" + auother + "]";
	}
	

}
