package com.example.library.book.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.library.book.service.BookService;

@RestController
public class BookController {

	@Autowired
	BookService bookService;

	@PostMapping("/save")
	public String saveBook(@RequestBody Book book) {
		 
		return bookService.saveBook(book);

	}
	
	@GetMapping("/get")
	public Book getDataById(@RequestParam
			
			
			String bookid) {
		return bookService.getDataById(bookid);
	}
	
	
	  @DeleteMapping("/delete") 
	  public String deleteData(@RequestParam  String string) {
		  
	  bookService.deleteData(string);
	  return "Successfully delete data";
			  }
	  @GetMapping("/getalldata")
	  public List<Book> getAllData() {
		  return bookService.getAllData();
		  
	  }
	 

}
