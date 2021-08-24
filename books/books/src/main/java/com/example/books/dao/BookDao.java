package com.example.books.dao;

import java.util.List;

import com.example.books.controller.Book;

public interface BookDao {
	public String saveBook(Book book);
	public void deleteData(String string);
	public Book getDataById(String bookid);
	public List<Book> getAllData();
		
}
