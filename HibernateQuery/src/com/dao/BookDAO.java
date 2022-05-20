package com.dao;
import java.util.List;

import com.entities.Book;


public interface BookDAO {
	void commitTranscation();
	void beginTranscation();
	void addBook(Book book);
	Book getBookById(int id);
	List<Book> getBookByTitle(String title);
	Long getBookCount();
	List<Book> getAuthorBooks(String author);
	List<Book> getAllBooks();
	List<Book> getBooksInPriceRange(double low, double high);
}
