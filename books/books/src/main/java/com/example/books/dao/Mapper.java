package com.example.books.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;

import com.example.books.controller.Book;

public class Mapper implements RowMapper<Book>{
	@Override public Book mapRow(ResultSet rs, int rowNum) throws SQLException {
		  Book book=new Book();
		  
		  book.setBookId(rs.getString("bookid"));
		  book.setBookName(rs.getString("bookname"));
		  book.setAuother(rs.getString("auother"));
		  
		   return book; }
		  
		  public List<Book> mappRow(ResultSet rs, int rowNum) throws SQLException {
			  Book book = new Book();
			  book.setBookId(rs.getString("bookidid"));
			  book.setBookName(rs.getString("bookname"));
			  book.setAuother(rs.getString("auother"));
			  return (List<Book>) book;
			  }

}
