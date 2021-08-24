package com.example.books.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.books.controller.Book;
@Service
public interface BookService {
	public String saveBook(Book book);

	public void deleteData(String string);

	public Book getDataById(String bookid);

	public List<Book> getAllData();

}
