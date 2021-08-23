package com.example.library.book.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import com.example.library.book.controller.Book;

@Repository
public class BookDaoImpl implements BookDao {
	@Autowired
	private NamedParameterJdbcTemplate namedJdbcTemplate;


	public BookDaoImpl(NamedParameterJdbcTemplate namedJdbcTemplate) {

		this.namedJdbcTemplate = namedJdbcTemplate;
	}

	@Override
	public String saveBook(Book book2) {
		System.out.println(book2);
		String query = "insert into books values(:bookid,:bookname,:auother)";
		MapSqlParameterSource map = new MapSqlParameterSource();
		map.addValue("bookid", book2.getBookId());
		map.addValue("bookname", book2.getBookName());
		map.addValue("auother", book2.getAuother());
		System.out.println(map);
		System.out.println(namedJdbcTemplate.update(query, map));
		
		return "Successfully inserted book into your library";

	}

	@Override
	public void deleteData(String string) {
		String query = "delete from books where bookid=:bookid";

		SqlParameterSource sqlParameterSource = new MapSqlParameterSource("bookid", string);
		System.out.println(sqlParameterSource);

		namedJdbcTemplate.update(query, sqlParameterSource);
	}

	@Override
	public Book getDataById(String bookid) {
		String query = "select bookid,bookname,auother from books where bookid=:bookid";
		Map<String, String> parameter = new HashMap<String, String>();
		parameter.put("bookid", bookid);
		return namedJdbcTemplate.queryForObject(query, parameter, new Mapper());
	}

	@Override
	public List<Book> getAllData() {
		String query = "select * from books";

		return namedJdbcTemplate.query(query, new Mapper());
	}

}
