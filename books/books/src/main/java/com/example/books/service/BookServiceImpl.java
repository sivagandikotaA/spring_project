package com.example.books.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.books.controller.Book;
import com.example.books.dao.BookDao;
@Service
public class BookServiceImpl implements BookService {

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
