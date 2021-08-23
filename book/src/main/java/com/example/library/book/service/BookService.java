package com.example.library.book.service;



import java.util.List;

import org.springframework.web.bind.annotation.RequestParam;

import com.example.library.book.controller.Book;

public interface BookService {
	
public String saveBook(Book book);
public void deleteData(String string);
public Book getDataById(String bookid);
public List<Book> getAllData();

}
