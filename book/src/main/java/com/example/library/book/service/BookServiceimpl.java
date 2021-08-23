package com.example.library.book.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.library.book.controller.Book;
import com.example.library.book.dao.BookDao;

@Service
public class BookServiceimpl implements BookService {
	@Autowired
	BookDao bookDao;

	@Override
	 public String saveBook(Book book1) {
		
		if(book1.getBookId() != null && book1.getBookName()!=null && book1.getAuother()!=null ) {
			
		
		return bookDao.saveBook(book1);
		}
		else {
			return "enter  required fields";
		}
		
	}
	public Book getDataById( String bookid) {
		return bookDao.getDataById(bookid);
	}

	
	  @Override public void deleteData(String string) {
	  
	   bookDao.deleteData(string); }
	@Override
	public List<Book> getAllData() {
		
		return bookDao.getAllData();
	}
	 
}
