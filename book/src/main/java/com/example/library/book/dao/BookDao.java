package com.example.library.book.dao;



import java.util.List;

import com.example.library.book.controller.Book;

public interface BookDao {
	public String saveBook(Book book);
	public void deleteData(String string);
	public Book getDataById(String bookid);
	public List<Book> getAllData();
		
		
}

